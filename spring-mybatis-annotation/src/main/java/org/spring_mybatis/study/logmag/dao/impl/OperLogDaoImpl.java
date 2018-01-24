package org.spring_mybatis.study.logmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.logmag.beans.OperaLogBean;
import org.spring_mybatis.study.logmag.dao.IOperLogDao;
import org.spring_mybatis.study.logmag.mapper.OperLogMapper;
import org.springframework.stereotype.Repository;

@Repository
public class OperLogDaoImpl implements IOperLogDao {
	
	private OperLogMapper om;
	
	public void setSession(SqlSession session){
		om = session.getMapper(OperLogMapper.class);
	}
	
	public int saveOperLogBean(OperaLogBean log) {
		// TODO Auto-generated method stub
		return om.saveOperLogBean(log);
	}

}
