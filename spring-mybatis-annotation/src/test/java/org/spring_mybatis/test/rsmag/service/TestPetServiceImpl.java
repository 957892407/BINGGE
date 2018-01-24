package org.spring_mybatis.test.rsmag.service;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.spring_mybatis.study.relationshipmag.beans.Dog;
import org.spring_mybatis.study.relationshipmag.beans.Pet;
import org.spring_mybatis.study.relationshipmag.service.IPetService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:applicationContext.xml" })
public class TestPetServiceImpl {

	@Resource
	private IPetService petServiceImpl;

	@Test
	public void testGetAllPets() {
		List<Pet> pets = petServiceImpl.getAllPets();
		System.out.println(pets);

	}

	@Ignore
	public void testGetDogById() {
		Dog dog = petServiceImpl.getDogById(1l);
		System.out.println(dog);

	}

	@Ignore
	public void testSaveDog() {
		Dog dog = new Dog();
		dog.setName("´ó»Æ");
		dog.setBone(20);

		int rows = petServiceImpl.saveDog(dog);
		Assert.assertEquals(1, rows);
	}

}
