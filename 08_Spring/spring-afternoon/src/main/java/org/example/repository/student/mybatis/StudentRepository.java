package org.example.repository.student.mybatis;

import org.example.domain.StudentMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {
    private final StudentMapper studentMapper;

    @Autowired
    public StudentRepository(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }
    public List<StudentMybatis> findAll(){
        return studentMapper.findAll();
    }

    public StudentMybatis findById(Long id){
        return studentMapper.findById(id);
    }
    public StudentMybatis findByName(String name){
        return studentMapper.findByName(name);
    }
    public int save(StudentMybatis student){
        return studentMapper.save(student);
    }
    public int delete(Long id){
        return studentMapper.delete(id);
    }
    public int updateAge(StudentMybatis newStudent){
        return studentMapper.updateAge(newStudent);
    }
}
