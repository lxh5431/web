package lxh.crm.dao;

import lxh.crm.dao.base.BaseDao;
import lxh.crm.entity.Department;
import page.Page;

public interface DepartmentDao extends BaseDao<Department> {
	Page list(int currPage, int pageSize);

}
