package com.learning.spring6.iocxml.di;

import java.nio.channels.Pipe;

/**
 * ClassName: Employee
 * Package: com.learning.spring6.iocxml.di
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/03/2023
 */
public class Employee {
    private String empName;
    private Integer age;
    private Dept dept;

    public Employee() {
    }

    public Employee(String empName, Integer age) {
        this.empName = empName;
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void work(){
        System.out.println(empName + "的年龄为" + age + "在" + dept.getDeptName() + "部门工作");
    }

}
