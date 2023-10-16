package com.progra.api.subject.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_asignature")
public class subjectDto {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id

    private int asignature_id;
    private String name;
    private String code;
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
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    
}
