package com.springmvc.hibernate.core.dao;

import java.util.List;

import com.springmvc.hibernate.core.entity.Student;

import utilidades.common.hibernate.Updater;
import utilidades.common.page.Pagination;

/**
 *
 * @author
 */
public interface StudentDao
{

    Student deleteById(Integer id);

    Student findById(Integer id);

    Pagination getPage(int pageNo, int pageSize);

    Student save(Student bean);

    Student updateByUpdater(Updater<Student> updater);
    
    List<Student> getStudentsByFinder();
}
