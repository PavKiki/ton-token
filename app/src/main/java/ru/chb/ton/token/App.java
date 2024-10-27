package ru.chb.ton.token;

import org.ton.java.tonlib.Tonlib;
import ru.chb.ton.token.init.TonlibInitialization;

public class App {
    public static void main(String[] args) {
        var tonlib = new TonlibInitialization();
        tonlib.deployContract();
    }
}