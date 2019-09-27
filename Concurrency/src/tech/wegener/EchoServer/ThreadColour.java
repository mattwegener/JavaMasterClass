package tech.wegener.EchoServer;

public class ThreadColour extends Thread {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    /*
    public static String colour;
    public static long delay;

    public ThreadColour(String colour, long delay) {
        super();
        this.colour = colour;
        this.delay = delay;
    }

    @Override
    public void run() {
        while(true){
            System.out.println(colour + "Hello from another thread");
            try{
                sleep(delay);
            }catch (InterruptedException e){
                System.out.println("Interrupt " + e.getMessage());
            }
        }

    }
    */





}
