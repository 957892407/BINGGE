package org.spring_mybatis.study.relationshipmag.service.impl;

import javax.annotation.Resource;

import org.spring_mybatis.study.relationshipmag.beans.Wife;
import org.spring_mybatis.study.relationshipmag.dao.IWifeDao;
import org.spring_mybatis.study.relationshipmag.service.IWifeService;
import org.springframework.stereotype.Service;

@Service
public class WifeServiceImpl implements IWifeService {

	@Resource
	private IWifeDao wifeDaoImpl;
	
	
	public Wife getWifeWithHusbandById(Long id) {
		// TODO Auto-generated method stub
		return wifeDaoImpl.getWifeWithHusbandById(id);
	}

}
