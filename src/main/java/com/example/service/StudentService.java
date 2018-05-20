package com.example.service;

import com.example.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    int deleteByPrimaryKey(Integer id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(StudentEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    StudentEntity selectByPrimaryKey(Integer id);

    /**
     * 获取全部数据库记录
     *
     */
    List<StudentEntity> selectAll();

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(StudentEntity record);



}
