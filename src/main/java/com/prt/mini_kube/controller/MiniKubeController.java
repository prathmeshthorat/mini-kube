package com.prt.mini_kube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MiniKubeController {

    @GetMapping("/data")
    public String home() {
        return "<p>This is data from POD :)</p>";
    }
}
