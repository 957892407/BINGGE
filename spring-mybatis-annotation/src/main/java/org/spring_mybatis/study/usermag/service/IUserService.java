package org.spring_mybatis.study.usermag.service;

import java.util.List;
import java.util.Map;

import org.spring_mybatis.study.beans.Pager;
import org.spring_mybatis.study.usermag.beans.UserBean;

public interface IUserService {

	public int saveUserInfo(UserBean user);
	
	/**
	 * ����������
	 * @param users
	 * @return
	 */
	public int batchSaveUserInfo(List<UserBean> users);
	
	/**
	 * ����ɾ��
	 * @param ids
	 * @return
	 */
	public int batchDeleteUserInfo(Long [] ids);
	
	
	
	public int updateUserInfo(UserBean user);
	
	
	public int deleteUserInfoById(Long id);
	
	/**
	 * ����id��ѯ����
	 * @param id
	 * @return
	 */
	public UserBean getUserBeanById(Long id);
	
	/**
	 * ���ݵ�¼���������ѯ�û�
	 * @param loginName
	 * @param password
	 * @return
	 */
	public UserBean getUserBeanByLoginNameAndPassword(String loginName,String password);
	/**
	 * �������ѯ֮��ʽ��3
	 * @param map
	 * @return
	 */
	public UserBean getUserBeanByMap(Map map);
	
	
	public List<UserBean> getUserListByUserName(String userName);
	/**
	 * ��ҳ��ѯ
	 * @param map
	 * @return
	 */
	public Pager findUserListByMapToPager(Map map,Pager pager);
	
	
	
}
