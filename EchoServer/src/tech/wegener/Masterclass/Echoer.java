package tech.wegener.Masterclass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private Socket socket;

    public Echoer(Socket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        System.out.println("Client Connected");
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader( socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);

            while(true){
                String echoString = input.readLine();
                System.out.println("Recieced from " + socket.toString() + ": " + echoString);
                if(echoString.equals("exit") ||echoString.equals(null)){
                    break;
                }

                try{
                    Thread.sleep(300);
                } catch(InterruptedException e){
                    System.out.println("Thread Interrupted");
                }

                output.println("Echo from server: " + echoString);
            }
        } catch(NullPointerException ignored){

        } catch (IOException e){
            System.out.println("Oops " + e.getMessage());
        } finally {
            try {
                if(socket != null)
                    socket.close();
                System.out.println("Connection closed");
            } catch (IOException e){
                System.out.println("Error closing: " + e.getMessage());
            }
        }
    }
}
