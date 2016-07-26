package lxh.crm.dao.base.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import lxh.crm.dao.base.BaseDao;

public class BaseDaoImpl<T>  implements BaseDao<T> {
	protected HibernateTemplate hibernateTemp;
	private Class<T> clazz;
	

	public HibernateTemplate getHibernateTemp() {
		return hibernateTemp;
	}

	public void setHibernateTemp(HibernateTemplate hibernateTemp) {
		this.hibernateTemp = hibernateTemp;
	}

	public BaseDaoImpl(){
		ParameterizedType type=(ParameterizedType) this.getClass().getGenericSuperclass();
		
	}
	@Override
	public void save(T entity) {
		// TODO Auto-generated method stub
		hibernateTemp.save(entity);
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		hibernateTemp.delete(entity);
		
	}

	@Override
	public T findById(Integer id) {
		// TODO Auto-generated method stub
		return hibernateTemp.get(clazz, id);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		hibernateTemp.update(entity);
		
	}

	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		String hql="from"+clazz.getSimpleName();
		return hibernateTemp.find(hql);
	}

}
