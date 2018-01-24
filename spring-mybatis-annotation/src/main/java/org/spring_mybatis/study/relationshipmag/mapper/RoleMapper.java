package org.spring_mybatis.study.relationshipmag.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.spring_mybatis.study.relationshipmag.beans.Role;

public interface RoleMapper {
	/**
	 * 根据id查询角色，并显示其对应的用户
	 * @param id
	 * @return
	 */
	
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="roleName",column="role_name",javaType=String.class),
		@Result(property="persons",javaType=List.class,column="id",many=@Many(fetchType=FetchType.LAZY,select="org.spring_mybatis.study.relationshipmag.mapper.PersonMapper.getPersonByFkRoleId"))
	})
	@Select("select * from t_role where id = #{id}")
	public Role getRoleWithPersonById(@Param("id")Long id);
}
