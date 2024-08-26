package org.example.repository.student.mybatis;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.example.domain.StudentMybatis;

import java.util.List;

@Mapper
public interface StudentMapper {
    public List<StudentMybatis> findAll();
    public StudentMybatis findById(@Param("id") Long id);
    public StudentMybatis findByName(@Param("name") String name);
    public int save(StudentMybatis newStudent);
    public int delete(@Param("id") Long id);
    public int updateAge(StudentMybatis newStudent);
}
