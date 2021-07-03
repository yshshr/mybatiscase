package com.ysh.mybatiscase.bean;

public class MyTest {
    /**
     * 年龄
     */
    private String nl;

    /**
     * 姓名
     */
    private String xm;

    public String getNl() {
        return nl;
    }

    public void setNl(String nl) {
        this.nl = nl == null ? null : nl.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }
}