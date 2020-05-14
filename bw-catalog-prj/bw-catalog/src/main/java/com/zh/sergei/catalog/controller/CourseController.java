package com.zh.sergei.catalog.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zh.sergei.catalog.model.Course;
import com.zh.sergei.catalog.model.CourseType;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        Course freeCourse = new Course();
        freeCourse.setId(UUID.randomUUID().toString());
        freeCourse.setName("first free course");
        freeCourse.setCourseType(CourseType.FREE);
        return List.of(freeCourse);
    }
}
