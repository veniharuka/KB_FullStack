package org.example.controller.student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.StudentMybatis;
import org.example.repository.student.mybatis.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(value = "/student")
public class MybatisStudentController {
    private final StudentRepository studentRepository;

    @GetMapping("/show")
    public ResponseEntity<List<StudentMybatis>> findAll(){
        List<StudentMybatis> students = studentRepository.findAll();
        return ResponseEntity.ok().body(students);
    }


}
