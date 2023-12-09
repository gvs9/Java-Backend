package com.scaler;
import com.scaler.greetings.Greetings;
import com.scaler.http.Client;
public class Main {
    public static void main(String[] args){

        Greetings g1=new Greetings();
        System.out.println(g1.greet());
        Client c1=new Client();
        String response=c1.get("https://square.github.io/okhttp/");
        System.out.println(response);
    System.out.println("Hello world!");
    }
}