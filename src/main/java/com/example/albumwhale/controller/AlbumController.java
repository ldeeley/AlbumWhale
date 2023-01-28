package com.example.albumwhale.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    @GetMapping("/")
    public String albumHome(){
        return "Hello from Album Controller";
    }

}
