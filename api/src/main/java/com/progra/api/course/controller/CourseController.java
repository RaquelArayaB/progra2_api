package com.progra.api.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.progra.api.course.businessLogic.courseBI;
import com.progra.api.course.dataAccess.CourseRepository;
import com.progra.api.course.dto.courseDto;

@RestController
@RequestMapping("api/course")
public class CourseController {
    
    @Autowired
    private CourseRepository courseRep;

    @GetMapping
    public List<courseDto> courseList(){
        courseBI _CourseBl= new courseBI(courseRep);
        return _CourseBl.list();
    }

    @GetMapping("/{id}")
    public courseDto getCourse(@PathVariable long id){
        courseBI _CourseBl= new courseBI(courseRep);
        return _CourseBl.get(id);
    }

    @PostMapping("/add")
    public courseDto addCourse(@RequestBody courseDto course){
        courseBI _CourseBl= new courseBI(courseRep);
        return _CourseBl.add(course);
    }
}
