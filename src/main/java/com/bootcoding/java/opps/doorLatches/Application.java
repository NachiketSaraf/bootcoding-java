package com.bootcoding.java.opps.doorLatches;

public class Application {
    public static void main(String[] args) {
        Latches[] latches = new Latches[4];

        for (int i = 0;i<4;i++){
            latches[i] = new Latches();
        }

    }
}
