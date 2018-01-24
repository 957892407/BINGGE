package org.spring_mybatis.study.relationshipmag.service;

import java.util.List;

import org.spring_mybatis.study.relationshipmag.beans.Dog;
import org.spring_mybatis.study.relationshipmag.beans.Pet;

public interface IPetService {

	public int saveDog(Dog dog);
	/**
	 * ����id��ѯһ����
	 * @param id
	 * @return
	 */
	public Dog getDogById(Long id);
	
	
	public List<Pet> getAllPets();
	
	
	
	
	
}
