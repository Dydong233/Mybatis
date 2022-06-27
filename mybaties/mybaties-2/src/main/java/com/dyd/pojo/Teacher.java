package com.dyd.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}
