package tech.wegener.EchoServer;

import static tech.wegener.EchoServer.ThreadColour.ANSI_RED;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(ANSI_RED + "Hello from MyRunnables impl of run");
    }
}
