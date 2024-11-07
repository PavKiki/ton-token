package ru.chb.ton.token.init;

import org.ton.java.address.Address;
import org.ton.java.tonlib.Tonlib;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Logger;

public class TestnetInitialization {
    private static final Logger log = Logger.getLogger(TestnetInitialization.class.getName());

    private final Tonlib tonlib;

    public TestnetInitialization(boolean isTestNet) throws IOException {

        String globalConfigStr;
        try (InputStream inputStream = TestnetInitialization.class.getResourceAsStream("tonlib.config.json")) {
            if (inputStream == null) {
                throw new IllegalStateException("ton global config wasn't found");
            }

            byte[] configBytes = inputStream.readAllBytes();
            globalConfigStr = new String(configBytes, StandardCharsets.UTF_8);
        }

        this.tonlib = Tonlib.builder()
                            .testnet(isTestNet)
                            .pathToTonlibSharedLib("tonlibjson.dll")
//                            .pathToGlobalConfig("tonlib.config.json")
                            .globalConfigAsString(globalConfigStr)
                            .build();
    }

    public void getAccountStatus() {
        try {
            tonlib.getAccountStatus(new Address("baka"));
        } catch (Exception te) {
            log.info("Something went wrong while getting account info: " + te.getMessage());
        }
    }
}
