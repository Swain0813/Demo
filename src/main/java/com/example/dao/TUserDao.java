package com.example.dao;

import com.example.entity.TUserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TUserDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(TUserEntity record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    TUserEntity selectByPrimaryKey(Long id);

    /**
     * 获取全部数据库记录
     *
     */
    List<TUserEntity> selectAll();

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(TUserEntity record);
}