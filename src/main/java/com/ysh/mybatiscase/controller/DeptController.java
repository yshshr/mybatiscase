package com.ysh.mybatiscase.controller;

import com.ysh.mybatiscase.bean.DepartMent;
import com.ysh.mybatiscase.mapper.DepartMentMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class DeptController {
    @Autowired
    DepartMentMapper departMentMapper;

    @GetMapping(value = "/getDeptById/{id}")
    public DepartMent getDeptById(@PathVariable("id") int id) throws IOException {
        System.out.println("getDeptById进来了........"+"id:"+id);

        DepartMent depmentById = departMentMapper.getDepmentById(id);

        System.out.println("getDeptById结束...");
        return depmentById;
    }
}
