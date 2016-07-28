package core.service;


import core.mapper.IBaseMapper;

public abstract class BaseService<T> implements IBaseService<T> {
 public abstract IBaseMapper<T> getBaseMapper();
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().deletePrimaryKey(id);
	}

	public int insert(T record) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().insert(record);
	}

	public int insertSelective(T record) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().insertSelective(record);
	}

	public T selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().selectByPrimaryKey(id);
	}

	public int updateByPrimaryKeySelective(T record) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T record) {
		// TODO Auto-generated method stub
		return this.getBaseMapper().updateByPrimary(record);
	}
	

}
