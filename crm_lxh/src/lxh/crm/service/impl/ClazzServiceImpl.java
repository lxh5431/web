package lxh.crm.service.impl;

import java.util.List;

import lxh.crm.dao.ClazzDao;
import lxh.crm.entity.Clazz;
import lxh.crm.service.ClazzService;
import page.Page;

public class ClazzServiceImpl implements ClazzService {
private ClazzDao clazzDao;

	@Override
	public Page list(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		return clazzDao.list(currPage,pageSize);
	}
	

	public ClazzDao getClazzDao() {
		return clazzDao;
	}


	public void setClazzDao(ClazzDao clazzDao) {
		this.clazzDao = clazzDao;
	}


	@Override
	public void save(Clazz model) {
		// TODO Auto-generated method stub
		clazzDao.save(model);

	}

	@Override
	public Clazz findById(Integer id) {
		// TODO Auto-generated method stub
		return clazzDao.findById(id);
	}

	@Override
	public void update(Clazz clazz) {
		// TODO Auto-generated method stub
		clazzDao.update(clazz);

	}

	@Override
	public List<Clazz> findAll() {
		// TODO Auto-generated method stub
		return clazzDao.findAll();
	}

	@Override
	public List<Clazz> findNotEnd() {
		// TODO Auto-generated method stub
		return clazzDao.findNotRnd();
	}

}
