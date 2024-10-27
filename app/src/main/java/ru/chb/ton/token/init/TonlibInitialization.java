package ru.chb.ton.token.init;

import org.ton.java.tonlib.Tonlib;

import java.util.logging.Logger;

public class TonlibInitialization {
    private static final Logger log = Logger.getLogger(TonlibInitialization.class.getName());

    public Tonlib tonlib;

    public TonlibInitialization() {
        Tonlib tonlib = Tonlib.builder()
                              .pathToTonlibSharedLib("tonlibjson.dll")
//                              .keystorePath("we should figure out how and why we use keystore")
                              .testnet(true)
                              .build();
        //maybe we should watch this first
        //https://www.youtube.com/watch?v=SDUlVUYWo1I&list=PLXKwiq6Wt6m9aHs8SqfORk3bdEEhK2BLW&ab_channel=AlefmanVladimir%5BEN%5D
    }

    public void deployContract() {
        try {
            this.tonlib.createNewKey();
        } catch (Exception te) {
            log.info("Something went wrong in deploying smart contract: " + te.getMessage());
        }
    }
}
