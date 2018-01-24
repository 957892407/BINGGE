package org.spring_mybatis.study.relationshipmag.service.impl;

import javax.annotation.Resource;

import org.spring_mybatis.study.relationshipmag.beans.Role;
import org.spring_mybatis.study.relationshipmag.dao.IRoleDao;
import org.spring_mybatis.study.relationshipmag.service.IRoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements IRoleService {

	@Resource
	private IRoleDao roleDaoImpl;
	
	public Role getRoleWithPersonById(Long id) {
		// TODO Auto-generated method stub
		return roleDaoImpl.getRoleWithPersonById(id);
	}


	

}
