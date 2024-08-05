package org.scoula.ex03.controller;

import lombok.extern.log4j.Log4j;
import org.scoula.ex03.dto.SampleDTO;
import org.scoula.ex03.dto.SampleDTOList;
import org.scoula.ex03.dto.TodoDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/sample")
@Log4j
public class SampleController {
    @RequestMapping("") // url: /sample
    public void basic() {
        log.info("basic............");
    }
    @RequestMapping(value="/basic", method= {RequestMethod.GET, RequestMethod.POST}) // url: /sample/basic
    public void basicGet(){
        log.info("basic get............");
    }
    @GetMapping("/basicOnlyGet") // url: /sample/basicOnlyGet
    public void basicGet2(){
        log.info("basic get only get............");
    }
    @GetMapping("/ex01")
    public String ex01(SampleDTO dto) {
        log.info("" + dto);
        return "ex01";
    }
    @GetMapping("/ex02")
    public String ex02(
            @RequestParam("name") String name,
            @RequestParam("age") int age) {
        log.info("name: " + name);
        log.info("age: " + age);
        return "ex02";
    }
//    @GetMapping("/ex02List")
//    public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
//        log.info("ids: " + ids);
//        return "ex02List";
//    }
//    @GetMapping("/ex02Bean")
//    public String ex02Bean(SampleDTOList list) {
//        log.info("list dtos: " + list);
//        return "ex02Bean";
//    }
//
//    @GetMapping("/ex03")
//    public String ex03(TodoDTO todo) {
//        log.info("todo: " + todo);
//        return "ex03";
//    }
//    @GetMapping("/ex04")
//    public String ex04(SampleDTO dto, int page) {
//        log.info("dto: " + dto);
//        log.info("page: " + page);
//        return "sample/ex04";
//    }


}
