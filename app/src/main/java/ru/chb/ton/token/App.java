package ru.chb.ton.token;

import org.ton.java.tonlib.Tonlib;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        Tonlib tonlib = Tonlib.builder().build();
    }

}