package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class MinjuneController {
    @GetMapping("/minjune/v1/show")
    public String Mpage() {
        log.info("================> MinjuneController /");
        return "/minjune"; //web-inf 폴더에 minjune이라는 파일 찾음
    }
}
