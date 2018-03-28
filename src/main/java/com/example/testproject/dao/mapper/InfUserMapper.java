package com.example.testproject.dao.mapper;

import com.example.testproject.entity.InfUser;
import com.example.testproject.entity.InfUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


public interface InfUserMapper {
    long countByExample(InfUserExample example);

    int deleteByExample(InfUserExample example);

    int insert(InfUser record);

    int insertSelective(InfUser record);

    List<InfUser> selectByExample(InfUserExample example);

    int updateByExampleSelective(@Param("record") InfUser record, @Param("example") InfUserExample example);

    int updateByExample(@Param("record") InfUser record, @Param("example") InfUserExample example);
}