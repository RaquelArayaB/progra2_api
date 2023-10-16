package com.progra.api.course.businessLogic;

import java.util.List;

import com.progra.api.course.dataAccess.CourseRepository;
import com.progra.api.course.dto.courseDto;

public class courseBI {
    private CourseRepository courseRep;

    public courseBI(CourseRepository courseRep) {
        this.courseRep = courseRep;
    }

    public List<courseDto> list() {
        return courseRep.findAll();
    }

    public courseDto get(long course_id) {
        return courseRep.findById(course_id).orElse(null);
    }

    public courseDto add(courseDto course) {
        return courseRep.save(course);
    }
}
