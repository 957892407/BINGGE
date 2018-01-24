package org.spring_mybatis.study.usermag.service;

import java.util.List;
import java.util.Map;

import org.spring_mybatis.study.beans.Pager;
import org.spring_mybatis.study.usermag.beans.UserBean;

public interface IUserService {

	public int saveUserInfo(UserBean user);
	
	/**
	 * 批量的新增
	 * @param users
	 * @return
	 */
	public int batchSaveUserInfo(List<UserBean> users);
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	public int batchDeleteUserInfo(Long [] ids);
	
	
	
	public int updateUserInfo(UserBean user);
	
	
	public int deleteUserInfoById(Long id);
	
	/**
	 * 根据id查询对象
	 * @param id
	 * @return
	 */
	public UserBean getUserBeanById(Long id);
	
	/**
	 * 根据登录名与密码查询用户
	 * @param loginName
	 * @param password
	 * @return
	 */
	public UserBean getUserBeanByLoginNameAndPassword(String loginName,String password);
	/**
	 * 多参数查询之方式：3
	 * @param map
	 * @return
	 */
	public UserBean getUserBeanByMap(Map map);
	
	
	public List<UserBean> getUserListByUserName(String userName);
	/**
	 * 分页查询
	 * @param map
	 * @return
	 */
	public Pager findUserListByMapToPager(Map map,Pager pager);
	
	
	
}
