package com.projectx.codeecho.controller;

public class RoomLinkComparator {
    public boolean compareTwoLinks(String home, String away){
        if((home.compareTo(away))==0){
            return true;
        }
        else{
            return false;
        }
    }
}
