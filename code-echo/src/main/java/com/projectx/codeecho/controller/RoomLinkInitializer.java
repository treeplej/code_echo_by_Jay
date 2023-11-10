package com.projectx.codeecho.controller;

import java.util.Random;

public class RoomLinkInitializer {

    private final String roomLink;

    public RoomLinkInitializer(){
        this.roomLink = linkGenerator();
    }
    private String linkGenerator(){
        String akashic; //just temp

        int leftLimit = 48;  //number '0' if only alphabet, set int 97
        int rightLimit = 122; //alphabet 'z'
        int linkLength = 10;
        Random random = new Random();

        akashic = random.ints(leftLimit, rightLimit+1)
                .filter(i->(i<=57||i>=65)&&(i<=90||i>=97))
                .limit(linkLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return akashic;
    }

    public String getRoomLink() {
        return roomLink;
    }


}
