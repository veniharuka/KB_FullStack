package org.example.controller.student;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.domain.StudentMybatis;
import org.example.repository.student.mybatis.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping(value = "/student")
public class MybatisStudentController {
    private final StudentRepository studentRepository;

    @GetMapping("")
    public ResponseEntity<List<StudentMybatis>> findAll(){
        List<StudentMybatis> students = studentRepository.findAll();
        return ResponseEntity.ok().body(students);
    }
    @GetMapping("/id/{id}")
    public ResponseEntity<StudentMybatis> findById(@PathVariable Long id){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@");
        StudentMybatis findStudent = studentRepository.findById(id);

        if(findStudent == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(findStudent);
    }
    @GetMapping("/name/{name}")
    public ResponseEntity<StudentMybatis> findByName(@PathVariable String name){
        StudentMybatis findStudent = studentRepository.findByName(name);

        if(findStudent == null) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(findStudent);
    }
    @PostMapping("/")
    public ResponseEntity<StudentMybatis> save(
            @RequestParam("name") String name,
            @RequestParam("age") int age,
            @RequestParam("gender") String gender

    ){
        StudentMybatis newStudent = new StudentMybatis(null,name,age,gender);
        int affectedRows = studentRepository.save(newStudent);

        if(affectedRows == 0) return ResponseEntity.notFound().build();
        return ResponseEntity.ok().body(newStudent);
    }

    @DeleteMapping(value = "/{id}" , produces ="text/plain;charset=UTF-8" )
    public ResponseEntity<String> delete(@PathVariable Long id){
        int affectedRows = studentRepository.delete(id);

        if(affectedRows == 0) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("학생 데이터 삭제 실패");
        return ResponseEntity.ok("학생데이터 삭제 완료");
    }

    @PutMapping("/update")
    public ResponseEntity<StudentMybatis> updateAge(
            @RequestParam("name") String name,
            @RequestParam("age") int age
    ){

        StudentMybatis findStudent = studentRepository.findByName(name);
        findStudent.setAge(age);

        studentRepository.updateAge(findStudent);
        return ResponseEntity.ok(findStudent);
    }


}
