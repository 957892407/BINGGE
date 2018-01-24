package org.spring_mybatis.study.usermag.dao;

import java.util.List;
import java.util.Map;

import org.spring_mybatis.study.usermag.beans.UserBean;

public interface IUserDao {
	
	
	/**
	 * 统计有多少条记录符合查询条件
	 * @param map
	 * @return
	 */
	public int countUserListByMapToPager(Map map);
	/**
	 * 取出具体需要显示给用户的数据
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
	 * 根据id查询对象
	 * @param id
	 * @return
	 */
	public UserBean getUserBeanById(Long id);
	public UserBean getUserBeanByLoginNameAndPassword(String loginName, String password);
	public UserBean getUserBeanByMap(Map map);
	public List<UserBean> getUserListByUserName(String userName);
}
