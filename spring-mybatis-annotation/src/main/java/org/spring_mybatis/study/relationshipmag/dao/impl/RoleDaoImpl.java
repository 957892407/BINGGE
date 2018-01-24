package org.spring_mybatis.study.relationshipmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.relationshipmag.beans.Role;
import org.spring_mybatis.study.relationshipmag.dao.IRoleDao;
import org.spring_mybatis.study.relationshipmag.mapper.RoleMapper;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl implements IRoleDao {

	private RoleMapper rm;
	public void setSession(SqlSession session){
		rm = session.getMapper(RoleMapper.class);
	}
	
	public Role getRoleWithPersonById(Long id) {
		// TODO Auto-generated method stub
		return rm.getRoleWithPersonById(id);
	}

}
