package com.example.service.Impl;

import com.example.dao.StudentDao;
import com.example.entity.StudentEntity;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    StudentDao studentDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return studentDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(StudentEntity record) {
        return studentDao.insert(record);
    }

    @Override
    public StudentEntity selectByPrimaryKey(Integer id) {
        return studentDao.selectByPrimaryKey(id);
    }

    @Override
    public List<StudentEntity> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public int updateByPrimaryKey(StudentEntity record) {
        return studentDao.updateByPrimaryKey(record);
    }
}
