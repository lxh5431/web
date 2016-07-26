package lxh.crm.dao;

import lxh.crm.dao.base.BaseDao;
import lxh.crm.entity.CousuStudent;
import page.Page;

public interface CousuDao extends BaseDao<CousuStudent> {
	Page list(int currPage,int pageSize);

}
