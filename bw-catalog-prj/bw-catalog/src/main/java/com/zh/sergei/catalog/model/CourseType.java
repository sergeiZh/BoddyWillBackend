package com.zh.sergei.catalog.model;

public enum CourseType {

    PAYED("payed"), FREE("free");

    private String type;

    CourseType(String type){
        this.type = type;
    }
}
