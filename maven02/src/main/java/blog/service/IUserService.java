package blog.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import blog.dao.Role;
import blog.dao.User;
import blog.dto.input.UserEditDetails;
import blog.dto.output.UserDetails;
import core.service.IBaseService;

public interface IUserService extends IBaseService<User> {
	public List<Integer>getUserRoleList(Integer userId);
	/**
	 * �û���¼
	 * @param username �û���
	 * @param password ����
	 * @return
	 */
	public UserDetails login(String username,String password);
	/**
	 * �������û�
	 * @param username �û���
	 * @param password  ����
	 * @param des  ���
	 * @param tel �绰
	 * @param address ��ַ
	 */
	public void createUser(String username,String password,String des,String tel,String address);
	/**
	 * ��ȡ�Լ����û�����
	 * 
	 * @param userId
	 *            �û�id
	 * @return
	 */
	public UserDetails getUserDetails(Integer userId);

	/**
	 * ��ȡ�û������б�
	 * 
	 * @param level
	 *            �ȼ�
	 * @param username
	 *            �û�����ģ����ѯ��
	 * @return
	 */
	public List<User> getUserList(Integer level,String username,RowBounds rowBounds);

	/**
	 * �޸��û���Ϣ�����ǹ���Ա�����޸����ɫ��Ϣ��
	 * 
	 * @param userId
	 *            ������id
	 * @param userEditDetails
	 *            �û�����
	 */
	public void updateUserDetails(Integer userId,
			UserEditDetails userEditDetails);

	/**
	 * ����ɾ���û���Ϣ
	 * 
	 * @param ids
	 *            �û�id �����,�ֿ�
	 */
	public void deleteUser(String ids);
	/**
	 * ��ȡ��ɫ�б�idΪ��ȫ����ȡ��
	 * @param id ��ɫid
	 * @return
	 */
	public List<Role> getRoles(Integer id);
	/**
	 * ���ӽ�ɫ
	 * @param roleName ��ɫ��Ϣ
	 */
	public void addRole(String roleName);
}
	


