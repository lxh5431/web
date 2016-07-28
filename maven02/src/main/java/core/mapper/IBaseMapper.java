package core.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

public interface IBaseMapper<T> {
	int deletePrimaryKey(Integer id);
	int insert(T record);
	int insertSelective(T record);
  T selectByPrimaryKey(Integer id);
  int updateByPrimaryKeySelective(T record);
  int updateByPrimary(T record);
  List<T>getAllByPage(RowBounds rowBounds);
  

}
