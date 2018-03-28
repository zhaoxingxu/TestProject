package com.example.testproject.dao.impl;

import com.example.testproject.dao.InfUserDao;
import com.example.testproject.dao.mapper.InfUserMapper;
import com.example.testproject.entity.InfUser;
import com.example.testproject.entity.InfUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class InfUserDaoImpl implements InfUserDao {
    @Autowired
    private InfUserMapper infUserMapper;

    @Override
    public InfUser getTestUserInfo(String param) {
        InfUserExample params = new InfUserExample();
        params.createCriteria().andNameEqualTo(param);
        List<InfUser> users = infUserMapper.selectByExample(params);
        return users.isEmpty()?null:users.get(0);
    }
}
