package com.springmvc.hibernate.core.service;

import java.util.List;

import com.springmvc.hibernate.core.entity.Student;

import utilidades.common.page.Pagination;

public interface StudentService
{

    Student deleteById(Integer id);

    Student findById(Integer id);

    Pagination getPage(int pageNo, int pageSize);

    Student save(Student bean);

    Student update(Student bean);
    
    List<Student> getStudentsByFinder();

}