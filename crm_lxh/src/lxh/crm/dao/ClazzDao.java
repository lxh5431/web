package lxh.crm.dao;

import java.util.List;

import lxh.crm.dao.base.BaseDao;
import lxh.crm.entity.Clazz;
import page.Page;

public interface ClazzDao extends BaseDao<Clazz> {
	Page list(int currPage,int pageSize);
	List<Clazz>findNotRnd();

}
