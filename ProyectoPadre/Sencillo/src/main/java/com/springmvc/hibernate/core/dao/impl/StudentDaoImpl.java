package com.springmvc.hibernate.core.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springmvc.hibernate.core.dao.StudentDao;
import com.springmvc.hibernate.core.entity.Student;

import utilidades.common.hibernate.Finder;
import utilidades.common.hibernate.HibernateBaseDao;
import utilidades.common.page.Pagination;

@Repository
public class StudentDaoImpl extends HibernateBaseDao<Student, Integer> implements StudentDao
{

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(StudentDaoImpl.class
        .getName());

    @Override
    public Pagination getPage(int pageNo, int pageSize)
    {
        Criteria crit = createCriteria();
        Pagination page = findByCriteria(crit, pageNo, pageSize);
        return page;
    }

    @Override
    public Student findById(Integer id)
    {
        Student entity = get(id);
        return entity;
    }

    @Override
    public Student save(Student bean)
    {
        getSession().save(bean);
        return bean;
    }

    @Override
    public Student deleteById(Integer id)
    {
//        throw new UnsupportedOperationException();
        Student entity = super.get(id);
        if (entity != null)
        {
            getSession().delete(entity);
        }
        return entity;
    }

    @Override
    protected Class<Student> getEntityClass()
    {
        return Student.class;
    }
    
    public List<Student> getStudentsByFinder(){
    	List<Student> listado = new ArrayList<Student>();
    	
    	Finder finder = Finder.create("select st.id, st.name, st.age from student as st");
    	
    	return listado = (List<Student>)find(finder);    	
    	
    }
    
//    public List<Student> getAllStudents(){
//    	
////    	getSession().
//    }
    
}