package lxh.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;

import lxh.crm.dao.EmployeeDao;
import lxh.crm.dao.base.impl.BaseDaoImpl;
import lxh.crm.entity.Department;
import lxh.crm.entity.Employee;
import page.Page;
import util.MD5Utils;

public class EmployeeDaoImpl extends  BaseDaoImpl<Employee> implements EmployeeDao  {

	@Override
	public int check(Employee employee) {
		// TODO Auto-generated method stub
		String hql = "from Employee e where e.registName = ?";
		List<Employee> list = hibernateTemp.find(hql, employee.getRegistName());
		if(list.size()==0)
		{
			return 0;
		}
		return 1;
	}


		

	@Override
	public Page list(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		int pageFirst = (currPage-1)*pageSize;
		String hql = "select count(id) from Employee";
		Session sesssion = hibernateTemp.getSessionFactory().openSession();
		Long l = (Long) sesssion.createQuery(hql).uniqueResult();
		int rows = l.intValue();
		int totalPage = rows%pageSize ==0 ? rows/pageSize : rows/pageSize+1;
		List<Department> list = sesssion.createQuery("from Employee")
									.setFirstResult(pageFirst)
									.setMaxResults(pageSize).list();
		Page page = new Page(pageSize, totalPage, pageFirst, list);
		return page;
	}

	@Override
	public Boolean findByNandPass(EmployeeDao employee) {
		// TODO Auto-generated method stub
		String hql = "from Employee e where e.registName = ? and e.password = ?";
		List<Employee> list = hibernateTemp.find(hql, employee.getRegistName(),MD5Utils.md5(employee.getPassword()));
		if(list.size()>0)
		{
			return true;
		}
		return false;
	}
	} 


