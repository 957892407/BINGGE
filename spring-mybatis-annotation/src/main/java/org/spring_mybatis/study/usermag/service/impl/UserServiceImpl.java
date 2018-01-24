package org.spring_mybatis.study.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.spring_mybatis.study.beans.Pager;
import org.spring_mybatis.study.usermag.beans.UserBean;
import org.spring_mybatis.study.usermag.dao.IUserDao;
import org.spring_mybatis.study.usermag.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDaoImpl;
	
	public int saveUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		return userDaoImpl.saveUserInfo(user);
	}

	public int updateUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		return userDaoImpl.updateUserInfo(user);
	}

	public int deleteUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.deleteUserInfoById(id);
	}

	public UserBean getUserBeanById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanById(id);
	}

	public UserBean getUserBeanByLoginNameAndPassword(String loginName, String password) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanByLoginNameAndPassword(loginName, password);
	}

	public UserBean getUserBeanByMap(Map map) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserBeanByMap(map);
	}

	public List<UserBean> getUserListByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserListByUserName(userName);
	}

	public int batchSaveUserInfo(List<UserBean> users) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchSaveUserInfo(users);
	}

	public int batchDeleteUserInfo(Long[] ids) {
		// TODO Auto-generated method stub
		return userDaoImpl.batchDeleteUserInfo(ids);
	}

	public Pager findUserListByMapToPager(Map map,Pager pager) {
		// TODO Auto-generated method stub
		int totalRows = userDaoImpl.countUserListByMapToPager(map);
		List<?> datas = userDaoImpl.findUserListByMapToPager(map);
		pager.setTotalRows(totalRows);
		pager.setDatas(datas);
		return pager;
	}

}
