package com.ApiChecking.ApiCheck.entities;

import lombok.Data;

@Data
public class MyPojo {
    public String name;
    public int age;

    public MyPojo() {
    }

    public MyPojo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
