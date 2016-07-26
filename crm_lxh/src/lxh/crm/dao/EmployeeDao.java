package lxh.crm.dao;

import lxh.crm.dao.base.BaseDao;
import lxh.crm.entity.Employee;
import page.Page;

public interface EmployeeDao  extends BaseDao<Employee>{
	public int check(Employee employee);
	public Boolean findByNandPass(EmployeeDao employee);
	public Page list(int currPage,int pageSize);

}
