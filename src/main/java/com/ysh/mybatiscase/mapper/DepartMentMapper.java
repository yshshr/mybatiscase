package com.ysh.mybatiscase.mapper;

import com.ysh.mybatiscase.bean.DepartMent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

public interface DepartMentMapper {

    @Select(value="select * from department where id=#{id}")
    @Results(id="department",value={
            @Result(id=true,column = "id",property = "id"),
            @Result(column = "department_Name",property = "department_Name")
    } )
    public DepartMent getDepmentById(int id);
}
