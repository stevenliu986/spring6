package com.learning.spring6.iocxml.di;

import java.util.List;

/**
 * ClassName: Student
 * Package: com.learning.spring6.iocxml.di
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/03/2023
 */
public class Student {
    private List<Course> lessonList;

    private String name;
    private String id;

    public List<Course> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Course> lessonList) {
        this.lessonList = lessonList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void run(){
        System.out.println("Student Id: " + id + "Student's name: " + name);
        System.out.println(lessonList);
    }
}
