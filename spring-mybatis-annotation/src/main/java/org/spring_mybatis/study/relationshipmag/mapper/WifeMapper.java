package org.spring_mybatis.study.relationshipmag.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;
import org.spring_mybatis.study.relationshipmag.beans.Husband;
import org.spring_mybatis.study.relationshipmag.beans.Wife;

public interface WifeMapper {
	
	/**
	 * 新增一个未婚妻
	 * @param wife
	 */
	@Insert("insert into t_wife (name)values(#{wife.name})")
	@Options(useGeneratedKeys=true,keyProperty="wife.id")
	public int saveWifeInfo(@Param("wife")Wife wife);
	
	@Results({
		@Result(id=true,property="id",column="wId",javaType=Long.class),
		@Result(property="name",column="name",javaType=String.class),
		@Result(property="hus",javaType=Husband.class,column="wId",one=@One(fetchType=FetchType.LAZY,select="getHusbandByFkWifeId"))
	})
	@Select("select id as wId,name as name from t_wife where id = #{id}")
	public Wife getWifeWithHusbandById(@Param("id")Long id);
	
	@ResultType(Husband.class)
	@Select("select id ,name from t_hus where fk_wife_id = #{id}")
	public Husband getHusbandByFkWifeId(Long id);
	
	
}
