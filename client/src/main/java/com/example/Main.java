package com.example;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;


public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException{
        System.out.println("client partito");
        Socket s = new Socket("localhost",3000);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        out.writeBytes("Ciao" + '\n');
        String stringaMaiuscola= in.readLine();
        System.out.println(stringaMaiuscola);
        System.out.println("client Finito");

        s.close();
    }
}