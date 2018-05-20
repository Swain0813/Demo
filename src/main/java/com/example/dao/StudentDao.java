package com.example.dao;

import com.example.entity.StudentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
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