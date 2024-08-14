package org.example.controller.sample;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.sample.SampleDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
@Slf4j
public class SampleController {
    @GetMapping("/ex04")
    public String ex04(SampleDTO dto,@ModelAttribute("page") int page) {
        log.info("dto: " + dto);
        log.info("page: " + page);

        return "sample/ex04";
    }
}
