package com.learning.spring6.iocxml.di;

/**
 * ClassName: Book
 * Package: com.learning.spring6.iocxml.di
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 8/03/2023
 */
public class Book {
    private String bname;
    private String author;

    public Book() {
    }

    public Book(String bname, String author) {
        this.bname = bname;
        this.author = author;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
