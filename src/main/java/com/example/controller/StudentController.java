package com.example.controller;

import com.example.entity.StudentEntity;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("getAllStudent")
    public List<StudentEntity> getAllStudent() {
        return studentService.selectAll();
    }
    @RequestMapping("insert")
    public int insert(int id,String name,int age){
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setId(id);
        studentEntity.setName(name);
        studentEntity.setAge(age);

        return studentService.insert(studentEntity);
    }

}
