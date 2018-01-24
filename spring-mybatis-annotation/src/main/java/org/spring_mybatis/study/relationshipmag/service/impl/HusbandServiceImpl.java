package org.spring_mybatis.study.relationshipmag.service.impl;

import javax.annotation.Resource;

import org.spring_mybatis.study.relationshipmag.beans.Husband;
import org.spring_mybatis.study.relationshipmag.beans.Wife;
import org.spring_mybatis.study.relationshipmag.dao.IHusbandDao;
import org.spring_mybatis.study.relationshipmag.dao.IWifeDao;
import org.spring_mybatis.study.relationshipmag.service.IHusbandService;
import org.springframework.stereotype.Service;

@Service
public class HusbandServiceImpl implements IHusbandService {

	@Resource
	private IHusbandDao husbandDaoImpl;
	@Resource
	private IWifeDao wifeDaoImpl;
	
	public int marry(Husband hus,Wife wife) {
		// TODO Auto-generated method stub
		husbandDaoImpl.saveHusbandInfo(hus);
		wifeDaoImpl.saveWifeInfo(wife);
		hus.setWife(wife);
		return husbandDaoImpl.marry(hus);
	}

	public Husband getHusbandWithWifeById(Long id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.getHusbandWithWifeById(id);
	}

	public int deleteHusbandWithWifeById(Long id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.deleteHusbandWithWifeById(id);
	}

}
