package org.spring_mybatis.study.relationshipmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.spring_mybatis.study.relationshipmag.beans.Person;
import org.spring_mybatis.study.relationshipmag.beans.Role;

public interface PersonMapper {
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="personName",column="user_name",javaType=String.class),
		@Result(property="loginName",column="login_name",javaType=String.class),
		@Result(property="role",javaType=Role.class,column="fk_role_id",one=@One(select="getRoleById"))
	})
	
	@Select("select * from t_person where user_name like CONCAT(#{personName},'%')")
	public List<Person> getPersonWithRoleByPersonName(@Param("personName")String name);
	
	
	@ResultType(Role.class)
	@Select("select id as id,role_name as roleName from t_role where id = #{id}")
	public Role getRoleById(@Param("id")Long id);
	
	
	@ResultType(Person.class)
	@Select("select id as id,user_name as personName,login_name as loginName from t_person where fk_role_id = #{id}")
	public Person getPersonByFkRoleId(Long id);
	
	
	
}
