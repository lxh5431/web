package lxh.crm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import lxh.crm.entity.Course;
import page.Page;

public interface CourseService {
 Page list(int currPage,int pageSize);
 void save(Course model);
 Course findById(Integer id);
 void update(Course cour);
 List<Course>highQuery(DetachedCriteria dct);
 List<Course>findAll();
 
}
