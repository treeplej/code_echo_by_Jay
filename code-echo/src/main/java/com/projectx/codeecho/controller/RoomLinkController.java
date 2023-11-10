package com.projectx.codeecho.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class RoomLinkController {
    @GetMapping("/link/initailize")
    public String dispLink(){
        return "link";
    }

    @PostMapping
    public void execLink(){
        RoomLinkInitializer link = new RoomLinkInitializer();

    }
}
