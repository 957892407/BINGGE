package org.spring_mybatis.study.relationshipmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.relationshipmag.beans.Wife;
import org.spring_mybatis.study.relationshipmag.dao.IWifeDao;
import org.spring_mybatis.study.relationshipmag.mapper.WifeMapper;
import org.springframework.stereotype.Repository;

@Repository
public class WifeDaoImpl implements IWifeDao {

	private WifeMapper wm;
	
	public void setSession(SqlSession session){
		wm = session.getMapper(WifeMapper.class);
	}
	
	public int saveWifeInfo(Wife wife) {
		// TODO Auto-generated method stub
		return wm.saveWifeInfo(wife);
	}

	public Wife getWifeWithHusbandById(Long id) {
		// TODO Auto-generated method stub
		return wm.getWifeWithHusbandById(id);
	}
}
