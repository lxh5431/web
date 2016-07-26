package lxh.crm.service.impl;

import org.hibernate.criterion.DetachedCriteria;

import lxh.crm.dao.CourseDao;
import lxh.crm.entity.Course;
import lxh.crm.service.CourseService;
import page.Page;

public class CourseServiceImpl implements CourseService {
 private CourseDao courseDao;
 
	public CourseDao getCourseDao() {
	return courseDao;
}

public void setCourseDao(CourseDao courseDao) {
	this.courseDao = courseDao;
}

	@Override
	public Page list(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return courseDao.list(currPage, pageSize);
	}

	@Override
	public void save(Course model) {
		// TODO Auto-generated method stub
		courseDao.save(model);

	}

	@Override
	public Course findById(Integer id) {
		// TODO Auto-generated method stub
		return courseDao.findById(id);
	}

	@Override
	public void update(Course cour) {
		// TODO Auto-generated method stub
		courseDao.update(cour);

	}

	@Override
	public java.util.List<Course> highQuery(DetachedCriteria dct) {
		// TODO Auto-generated method stub
		return courseDao.highQuery(dct);
	}

	@Override
	public java.util.List<Course> findAll() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

}
