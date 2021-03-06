package lxh.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;

import lxh.crm.dao.ClazzDao;
import lxh.crm.dao.base.impl.BaseDaoImpl;
import lxh.crm.entity.Clazz;
import lxh.crm.entity.Department;
import page.Page;

public class ClazzDaoImpl extends BaseDaoImpl<Clazz> implements ClazzDao {

	@Override
	public Page list(int currPage, int pageSize) {
		// TODO Auto-generated method stub
		int pageFirst=(currPage-1)*pageSize;
		String hql="select count(id) from Clazz";
		Session session=hibernateTemp.getSessionFactory().openSession();
		Long l=(Long)session.createQuery(hql).uniqueResult();
		int rows=l.intValue();
		int totalPage=rows%pageSize==0?rows/pageSize:rows/pageSize+1;
		List<Department>list=session.createQuery("from Clazz")
		.setFirstResult(pageFirst).setMaxResults(pageSize).list();
		Page page=new Page(pageSize,totalPage,pageFirst,list);
		return page;
	}

	@Override
	public List<Clazz> findNotRnd() {
		// TODO Auto-generated method stub
		String hql="from Clazz c where c.status!=?";
		List<Clazz>lists=hibernateTemp.find(hql,"�ѽ��");
				
		return lists;
	}

}
