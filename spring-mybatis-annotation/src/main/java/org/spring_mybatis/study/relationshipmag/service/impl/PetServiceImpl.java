package org.spring_mybatis.study.relationshipmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.spring_mybatis.study.relationshipmag.beans.Dog;
import org.spring_mybatis.study.relationshipmag.beans.Pet;
import org.spring_mybatis.study.relationshipmag.dao.IPetDao;
import org.spring_mybatis.study.relationshipmag.service.IPetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceImpl implements IPetService{

	@Resource
	private IPetDao petDaoImpl;
	
	public int saveDog(Dog dog) {
		// TODO Auto-generated method stub
		return petDaoImpl.saveDog(dog);
	}

	public Dog getDogById(Long id) {
		// TODO Auto-generated method stub
		return petDaoImpl.getDogById(id);
	}

	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		return petDaoImpl.getAllPets();
	}

}
