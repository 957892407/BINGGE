package org.spring_mybatis.study.relationshipmag.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.spring_mybatis.study.relationshipmag.beans.Dog;
import org.spring_mybatis.study.relationshipmag.beans.Pet;
import org.spring_mybatis.study.relationshipmag.dao.IPetDao;
import org.spring_mybatis.study.relationshipmag.mapper.PetMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PetDaoImpl implements IPetDao {

	private PetMapper pm;
	
	public void setSession(SqlSession session){
		pm = session.getMapper(PetMapper.class);
	}
	
	public int saveDog(Dog dog) {
		// TODO Auto-generated method stub
		return pm.saveDog(dog);
	}

	public Dog getDogById(Long id) {
		// TODO Auto-generated method stub
		return pm.getDogById(id);
	}

	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		return pm.getAllPets();
	}

}
