package org.spring_mybatis.study.relationshipmag.dao;

import java.util.List;

import org.spring_mybatis.study.relationshipmag.beans.Dog;
import org.spring_mybatis.study.relationshipmag.beans.Pet;

public interface IPetDao {
	
	public int saveDog(Dog dog);
	/**
	 * 根据id查询一条狗
	 * @param id
	 * @return
	 */
	public Dog getDogById(Long id);
	
	
	public List<Pet> getAllPets();
}
