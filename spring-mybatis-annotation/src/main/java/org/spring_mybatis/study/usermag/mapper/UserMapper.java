package org.spring_mybatis.study.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.spring_mybatis.study.usermag.beans.UserBean;

public interface UserMapper {
	
	
	
	@InsertProvider(type=UserSQLProvide.class,method="batchSaveUserInfo")
	public int batchSaveUserInfo(@Param("users") List<UserBean> users);
	
	@DeleteProvider(type=UserSQLProvide.class,method="batchDeleteUserInfo")
	public int batchDeleteUserInfo(Long [] ids);
	
	@Insert("insert into t_user (user_name,age,pwd) values (#{user.userName},#{user.age},#{user.password})")
	@Options(useGeneratedKeys=true,keyProperty="user.id")
	public int saveUserInfo(@Param("user")UserBean u);
	
	public int updateUserInfo(@Param("user")UserBean user);
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="age",column="age",javaType=Integer.class),
		@Result(property="password",column="pwd",javaType=String.class),
		@Result(property="loginName",column="login_name",javaType=String.class)
	})
//	@ResultMap("userMap")//如果配置文件存在，并且指定了映射关系
	@Select("select * from t_user where id = #{id}")
	public UserBean getUserBeanById(@Param("id")Long id);

	@Delete("delete from t_user where id = #{id}")
	public int deleteUserInfoById(@Param("id")Long id);
	
	@Results({
		@Result(id=true,property="id",column="id",javaType=Long.class),
		@Result(property="userName",column="user_name",javaType=String.class),
		@Result(property="age",column="age",javaType=Integer.class),
		@Result(property="password",column="pwd",javaType=String.class),
		@Result(property="loginName",column="login_name",javaType=String.class)
	})
	@Select("select * from t_user where login_name = #{loginName} and pwd = #{password}")
	public UserBean getUserBeanByLoginNameAndPassword(@Param("loginName")String loginName, @Param("password")String password);
	
	
	public UserBean getUserBeanByMap(@Param("map")Map map);
	
	@ResultType(UserBean.class)
	@Select("select login_name as loginName,pwd as password from t_user where user_name like CONCAT(#{userName},'%')")
	public List<UserBean> getUserListByUserName(@Param("userName")String userName);

	public int countUserListByMapToPager(@Param("map")Map map);
	
	public List<?> findUserListByMapToPager(@Param("map")Map map);

}
