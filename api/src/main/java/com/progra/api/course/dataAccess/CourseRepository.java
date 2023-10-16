package com.progra.api.course.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import com.progra.api.course.dto.courseDto;

public interface CourseRepository extends JpaRepository<courseDto, Long>{
    
}
