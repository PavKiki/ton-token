package ru.chb.ton.token;

import ru.chb.ton.token.init.TestnetInitialization;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        var tonlib = new TestnetInitialization(true);
        tonlib.getAccountStatus();
    }
}