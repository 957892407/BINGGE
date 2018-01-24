package org.spring_mybatis.study.relationshipmag.service;

import org.spring_mybatis.study.relationshipmag.beans.Wife;

public interface IWifeService {
	
	public Wife getWifeWithHusbandById(Long id);
}
