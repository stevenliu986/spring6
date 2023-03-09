package com.learning.spring6.iocxml.di;

/**
 * ClassName: Lesson
 * Package: com.learning.spring6.iocxml.di
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 9/03/2023
 */
public class Course {
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}
