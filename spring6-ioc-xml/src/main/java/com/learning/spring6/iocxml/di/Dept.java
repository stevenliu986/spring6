package com.learning.spring6.iocxml.di;

/**
 * ClassName: Dept
 * Package: com.learning.spring6.iocxml.di
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/03/2023
 */
public class Dept {
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    void info(){
        System.out.println("部门名称" + deptName);
    }
}
