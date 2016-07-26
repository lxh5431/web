package lxh.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import lxh.crm.dao.base.BaseDao;
import lxh.crm.entity.Course;
import page.Page;

public interface CourseDao extends BaseDao<Course> {
	Page list(int currPage,int pageSize);
	List<Course>highQuery(DetachedCriteria dct);

}
