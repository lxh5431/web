package lxh.crm.service.impl;


import org.springframework.beans.BeanUtils;

import lxh.crm.dao.ClazzDao;
import lxh.crm.dao.CousuDao;
import lxh.crm.dao.StudentDao;
import lxh.crm.entity.Clazz;
import lxh.crm.entity.CousuStudent;
import lxh.crm.entity.Student;
import lxh.crm.service.CousuService;
import page.Page;

public class CousuServiceImpl implements CousuService {
	private CousuDao cousuDao;
	private ClazzDao clazzDao;
	private StudentDao stuDao;
	
	public StudentDao getStuDao() {
		return stuDao;
	}

	public void setStuDao(StudentDao stuDao) {
		this.stuDao = stuDao;
	}

	public ClazzDao getClazzDao() {
		return clazzDao;
	}

	public void setClazzDao(ClazzDao clazzDao) {
		this.clazzDao = clazzDao;
	}

	public CousuDao getCousuDao() {
		return cousuDao;
	}

	public void setCousuDao(CousuDao cousuDao) {
		this.cousuDao = cousuDao;
	}

	@Override
	public Page list(int currPage, int pageSize) {
		return cousuDao.list(currPage,pageSize);
	}

	@Override
	public void save(CousuStudent cousuStu) {
		cousuDao.save(cousuStu);
	}

	@Override
	public CousuStudent findById(Integer id) {
		return cousuDao.findById(id);
	}

	@Override
	public void update(CousuStudent cousuStu) {
		cousuDao.update(cousuStu);
	}

	@Override
	public void inClass(Integer id, Integer clazzId) {
		CousuStudent cs = cousuDao.findById(id);
		Clazz clazz = clazzDao.findById(clazzId);
		cs.setClazz(null);
		Student stu = new Student();
		try
		{
			BeanUtils.copyProperties(cs, stu);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		cousuDao.delete(cs);
		stuDao.save(stu);
		stu.setClazz(clazz);
		clazz.setStuCounts(clazz.getStuCounts()+1);
	}

}
