package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class HomeController {
    @GetMapping("/")
    public String home(Model model) {
        log.info("================> HomController /");

        model.addAttribute("name", "민준 초이");
        return "index"; //web-inf 폴더에 index라는 파일 찾음
    }
}
