package tech.wegener.Masterclass;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(10321)){
            while(true) {
                new Echoer(serverSocket.accept()).start();

            }

        }catch (IOException e){
            System.out.println("Server exception " + e.getMessage());;
        }
    }
}
