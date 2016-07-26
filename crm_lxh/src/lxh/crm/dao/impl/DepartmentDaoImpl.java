package lxh.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;

import lxh.crm.dao.DepartmentDao;
import lxh.crm.dao.base.impl.BaseDaoImpl;
import lxh.crm.entity.Department;
import page.Page;

public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao {

	@Override
	public Page list(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		int pageFirst = (currPage-1)*pageSize;
		String hql = "select count(id) from Department";
		Session sesssion = hibernateTemp.getSessionFactory().openSession();
		Long l = (Long) sesssion.createQuery(hql).uniqueResult();
		int rows = l.intValue();
		int totalPage = rows%pageSize ==0 ? rows/pageSize : rows/pageSize+1;
		List<Department> list = sesssion.createQuery("from Department")
									.setFirstResult(pageFirst)
									.setMaxResults(pageSize).list();
		Page page = new Page(pageSize, totalPage, pageFirst, list);
		return page;
	}
}
