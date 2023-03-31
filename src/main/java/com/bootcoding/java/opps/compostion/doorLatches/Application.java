package com.bootcoding.java.opps.compostion.doorLatches;

public class Application {
    public static void main(String[] args) {
        Latches[] latches = new Latches[4];
        Lock l = new Lock();

        for (int i = 0;i<4;i++){
            latches[i] = new Latches();
        }
        Door door = new Door();
        door.latches = latches;
        door.lavda =l;
        System.out.println(door.latches);
    }
}
