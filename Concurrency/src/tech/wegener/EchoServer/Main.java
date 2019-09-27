package tech.wegener.EchoServer;

import static tech.wegener.EchoServer.ThreadColour.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "Hello from " + currentThread().getName());

        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread ==");
        anotherThread.start();

        new Thread(){
            public void run(){
                System.out.println(ANSI_GREEN + "Hello from anonymous");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "Hello from anonymous impl override");
                try{
                    anotherThread.join(2000);
                    System.out.println(ANSI_RED + "AnotherThread terminated or timed out, I am running again");
                } catch (InterruptedException e){
                    System.out.println(ANSI_RED + " Couldn't wait, I was interrupted");
                }
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE + "Hello from " + currentThread().getName());
    }
}
