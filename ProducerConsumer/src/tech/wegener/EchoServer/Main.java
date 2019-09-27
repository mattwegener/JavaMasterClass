package tech.wegener.EchoServer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

import static tech.wegener.EchoServer.Main.EOF;

public class Main {
    public static final String EOF = "EOF";
    public static void main(String[] args) {
	    List<String> buffer = new ArrayList<>();
        ReentrantLock bufferLock = new ReentrantLock();
	    MyProducer producer = new MyProducer(buffer,ThreadColor.ANSI_YELLOW,bufferLock);
	    MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_PURPLE,bufferLock);
	    MyConsumer consumer2 = new MyConsumer(buffer,ThreadColor.ANSI_CYAN,bufferLock);

	    new Thread(producer).start();
	    new Thread(consumer1).start();
	    new Thread(consumer2).start();

    }
}

class MyProducer implements Runnable {
    private List<String> buffer;
    private String color;
    ReentrantLock bufferLock;

    public MyProducer(List<String> buffer, String color,ReentrantLock bufferLock) {
        this.bufferLock = bufferLock;
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1","2","3","4","5"};

        for(String num: nums){
            try {
                System.out.println(color + "Adding..." + num);
                bufferLock.lock();
                try{
                    buffer.add(num);
                }
                finally {
                    bufferLock.unlock();
                }

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e){
                System.out.println("Prod was inter");
            }
        }
        System.out.println(color + "Adding to EOF and Exiting...");
        bufferLock.lock();
        try{
            buffer.add("EOF");
        }finally {
            bufferLock.unlock();
        }


    }
}

class MyConsumer implements Runnable {
    private List<String> buffer;
    private String color;
    ReentrantLock bufferLock;


    public MyConsumer(List<String> buffer, String color,ReentrantLock bufferLock) {
        this.bufferLock = bufferLock;
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        while (true) {
            bufferLock.lock();
            try{
                if (buffer.isEmpty()) {
                    continue;
                }
                if (buffer.get(0).equals(EOF)) {
                    System.out.println(color + "Exiting");
                    break;
                } else {
                    System.out.println(color + "Removed " + buffer.remove(0));
                }
            } finally {
                bufferLock.unlock();
            }
        }
    }
}