package com.example.service.Impl;

import com.example.dao.TUserDao;
import com.example.entity.TUserEntity;
import com.example.service.TuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TuserServiceImpl implements TuserService {


    @Autowired
    TUserDao tuserDao;

    @Override
    public List<TUserEntity> selectAll() {
        return tuserDao.selectAll();
    }
}
