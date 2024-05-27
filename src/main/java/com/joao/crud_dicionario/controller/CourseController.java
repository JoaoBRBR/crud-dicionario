package com.joao.crud_dicionario.controller;

import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joao.crud_dicionario.model.Course;
import com.joao.crud_dicionario.repository.CourseRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {

    private CourseRepository courseRepository;


    @GetMapping
    public List<Course> list() {
        return courseRepository.findAll();
    }


}
