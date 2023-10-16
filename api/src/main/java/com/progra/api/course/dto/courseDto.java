package com.progra.api.course.dto;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_courses")
public class courseDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private int course_id;
    private int asignature_id;
    private String name;
    private String author;
    private Date creation_time;
    private double points;
    
    public int getCourse_id() {
        return course_id;
    }
    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }
    public int getAsignature_id() {
        return asignature_id;
    }
    public void setAsignature_id(int asignature_id) {
        this.asignature_id = asignature_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Date getCreation_time() {
        return creation_time;
    }
    public void setCreation_time(Date creation_time) {
        this.creation_time = creation_time;
    }
    public double getPoints() {
        return points;
    }
    public void setPoints(double points) {
        this.points = points;
    }
    
    
    
}
