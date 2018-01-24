package org.spring_mybatis.study.relationshipmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Case;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.TypeDiscriminator;
import org.spring_mybatis.study.relationshipmag.beans.Cat;
import org.spring_mybatis.study.relationshipmag.beans.Dog;
import org.spring_mybatis.study.relationshipmag.beans.Pet;

public interface PetMapper {
	
	@Insert("insert into t_pets (name,type,bone) values (#{dog.name},0,#{dog.bone})")
	@Options(useGeneratedKeys=true,keyProperty="dog.id")
	public int saveDog(@Param("dog")Dog dog);
	/**
	 * 根据id查询一条狗
	 * @param id
	 * @return
	 */
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="name",javaType=String.class)
	})
	@TypeDiscriminator(javaType=Integer.class,column="type",cases={
			@Case(value="0",type=Dog.class,results={@Result(property="bone",column="bone",javaType=Integer.class)})	
			,@Case(value="1",type=Cat.class,results={@Result(property="fish",column="fish",javaType=Integer.class)})	
		})
	@Select("select * from t_pets where id = #{id} and type = 0")
	public Dog getDogById(Long id);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="name",column="name",javaType=String.class)
	})
	@TypeDiscriminator(javaType=Integer.class,column="type",cases={
			@Case(value="0",type=Dog.class,results={@Result(property="bone",column="bone",javaType=Integer.class)})	
			,@Case(value="1",type=Cat.class,results={@Result(property="fish",column="fish",javaType=Integer.class)})	
		})
	@Select("select * from t_pets")
	public List<Pet> getAllPets();
}
