package org.spring_mybatis.study.relationshipmag.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.relationshipmag.beans.Husband;
import org.spring_mybatis.study.relationshipmag.dao.IHusbandDao;
import org.spring_mybatis.study.relationshipmag.mapper.HusbandMapper;
import org.springframework.stereotype.Repository;

@Repository
public class HusbandDaoImpl implements IHusbandDao {

	private HusbandMapper hm;
	
	public void setSession(SqlSession session){
		hm = session.getMapper(HusbandMapper.class);
	}
	
	public int saveHusbandInfo(Husband hus) {
		// TODO Auto-generated method stub
		return hm.saveHusbandInfo(hus);
	}

	public int marry(Husband hus) {
		// TODO Auto-generated method stub
		return hm.marry(hus);
	}

	public Husband getHusbandWithWifeById(Long id) {
		// TODO Auto-generated method stub
		return hm.getHusbandWithWifeById(id);
	}

	public int deleteHusbandWithWifeById(Long id) {
		// TODO Auto-generated method stub
		return hm.deleteHusbandWithWifeById(id);
	}

}
