package com.zh.sergei.catalog.model;

import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Course {

    private String id;

    private String name;

    private CourseType courseType;
}
