package org.spring_mybatis.study.usermag.dao;

import java.util.List;
import java.util.Map;

import org.spring_mybatis.study.usermag.beans.UserBean;

public interface IUserDao {
	
	
	/**
	 * ͳ���ж�������¼���ϲ�ѯ����
	 * @param map
	 * @return
	 */
	public int countUserListByMapToPager(Map map);
	/**
	 * ȡ��������Ҫ��ʾ���û�������
	 * @param map
	 * @return
	 */
	public List<?> findUserListByMapToPager(Map map);
	public int saveUserInfo(UserBean user);
	public int batchSaveUserInfo(List<UserBean> users);
	public int batchDeleteUserInfo(Long [] ids);
	public int updateUserInfo(UserBean user);
	public int deleteUserInfoById(Long id);
	/**
	 * ����id��ѯ����
	 * @param id
	 * @return
	 */
	public UserBean getUserBeanById(Long id);
	public UserBean getUserBeanByLoginNameAndPassword(String loginName, String password);
	public UserBean getUserBeanByMap(Map map);
	public List<UserBean> getUserListByUserName(String userName);
}
