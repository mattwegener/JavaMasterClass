package tech.wegener.EchoServer;


import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
        Message message = new Message();
        (new Thread(new Writer(message))).start();
        (new Thread(new Reader(message))).start();
        */

        (new Thread(new Test("One",200))).start();
        (new Thread(new Test("Two",400))).start();
    }

}
class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read(){
        while (empty){
            try{
                wait();
            } catch (InterruptedException e){

            }
        }
        empty = true;
        notifyAll();
        return message;
    }

    public  synchronized void write(String message){
        while(!empty){
            try{
                wait();
            } catch (InterruptedException e){

            }
        }
        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Writer implements Runnable{
    private Message message;
    public Writer(Message message){
        this.message = message;
    }
    @Override
    public void run() {
        String messages[] = {
                "Humpty Dumpty sat on a wall",
                "Humpty Dumpty had a great fall",
                "All the king's horses and all the king's men",
                "Couldn't put Humpty together again"
        };

        Random random = new Random();
        for(int i = 0; i <messages.length;i++){
            message.write(messages[i]);
            try{
                Thread.sleep(random.nextInt(2000));
            } catch(InterruptedException e){

            }
        }

        message.write("Finished");
    }

}

class Reader implements Runnable{
    private Message msg;

    public Reader(Message message){
        this.msg = message;
    }

    public void run(){
        Random random = new Random();
        for(String latestMsg = msg.read(); !msg.equals("Finished");latestMsg = msg.read()){
            System.out.println(latestMsg);
            try{
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e){

            }
        }
    }
}

class Test implements Runnable{
    private String msg;
    private int duration;
    public Test(String in, int delay) {
        msg = in;
        duration = delay;
    }

    @Override
    public void run() {
        while(true){
            try{
                Thread.sleep(duration);
            } catch (InterruptedException e){

            }
            System.out.println((System.currentTimeMillis() % 10000) +": " +msg);
            //notifyAll();
        }
    }
}