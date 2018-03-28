package com.example.testproject.service.impl;

import com.example.testproject.dao.InfUserDao;
import com.example.testproject.entity.InfUser;
import com.example.testproject.service.InfoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoUserServiceImpl implements InfoUserService {
    @Autowired
    InfUserDao infUserDao;

    @Override
    public InfUser getTestUserInfo(String param) {
        return infUserDao.getTestUserInfo(param);
    }
}
