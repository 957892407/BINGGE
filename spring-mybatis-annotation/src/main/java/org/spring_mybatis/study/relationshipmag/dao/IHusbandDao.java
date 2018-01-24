package org.spring_mybatis.study.relationshipmag.dao;

import org.spring_mybatis.study.relationshipmag.beans.Husband;

public interface IHusbandDao {
	/**
	 * 新增一个未婚夫
	 * @param hus
	 * @return
	 */
	public int saveHusbandInfo(Husband hus);
	/**
	 * 结婚
	 * @param hus
	 * @return
	 */
	public int marry(Husband hus);
	
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
