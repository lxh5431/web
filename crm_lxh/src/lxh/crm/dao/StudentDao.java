package lxh.crm.dao;

import java.util.List;

import lxh.crm.dao.base.BaseDao;
import lxh.crm.entity.Clazz;
import lxh.crm.entity.Student;
import page.Page;

public interface StudentDao extends BaseDao<Student> {
	Page list(int currPage,int pageSize);
	List<Student>findStuByClazz(Clazz clazz);

}
