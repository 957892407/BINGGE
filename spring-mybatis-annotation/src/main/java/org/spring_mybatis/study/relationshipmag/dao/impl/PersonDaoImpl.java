package org.spring_mybatis.study.relationshipmag.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.relationshipmag.dao.IPersonDao;
import org.spring_mybatis.study.relationshipmag.mapper.PersonMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl implements IPersonDao {

	private PersonMapper pm;
	
	public void setSession(SqlSession session){
		pm = session.getMapper(PersonMapper.class);
	}
	public List<?> getPersonWithRoleByPersonName(String name) {
		// TODO Auto-generated method stub
		return pm.getPersonWithRoleByPersonName(name);
	}

}
