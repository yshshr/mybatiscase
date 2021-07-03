package com.ysh.mybatiscase.bean;

import org.springframework.stereotype.Repository;

@Repository
public class DepartMent {

    private int id;
    private String department_Name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment_Name() {
        return department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        this.department_Name = department_Name;
    }
}
