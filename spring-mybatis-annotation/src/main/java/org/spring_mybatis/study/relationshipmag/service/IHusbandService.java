package org.spring_mybatis.study.relationshipmag.service;

import org.spring_mybatis.study.relationshipmag.beans.Husband;
import org.spring_mybatis.study.relationshipmag.beans.Wife;

public interface IHusbandService {

	/**
	 * 结婚
	 * @param hus
	 * @return
	 */
	public int marry(Husband hus,Wife wife);
	/**
	 * 根据id查询丈夫，并要求显示其妻子
	 * @param id
	 * @return
	 */
	public Husband getHusbandWithWifeById(Long id);
	/**
	 * 要求删除丈夫，并且删除其妻子
	 * @param id
	 * @return
	 */
	public int deleteHusbandWithWifeById(Long id);
}
