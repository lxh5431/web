package lxh.crm.service.impl;

import java.util.List;

import lxh.crm.dao.DepartmentDao;
import lxh.crm.entity.Department;
import lxh.crm.service.DepartmentService;
import page.Page;

public class DepartmentServiceImpl implements DepartmentService {
	private DepartmentDao departDao;
	
	public DepartmentDao getDepartDao() {
		return departDao;
	}

	public void setDepartDao(DepartmentDao departDao) {
		this.departDao = departDao;
	}

	@Override
	public Page list(int currPage, int pageSize) {
		
		return departDao.list(currPage, pageSize);
	}

	@Override
	public void save(Department depart) {
		
		departDao.save(depart);
	}

	@Override
	public void delete(Department depart) {
		
		departDao.delete(depart);
	}

	@Override
	public Department findById(Integer id) {
		
		return departDao.findById(id);
	}

	@Override
	public void update(Department depart) {
		departDao.update(depart);
		
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return departDao.findAll();
	}

}
