package org.spring_mybatis.study.usermag.mapper;

import java.util.List;
import java.util.Map;

import org.spring_mybatis.study.usermag.beans.UserBean;

public class UserSQLProvide {
	/**
	 * 
	 * @param params 来至于调用方法    @Param("users")
	 * @return 需要执行的SQL语句
	 */
	public String batchSaveUserInfo(Map<String,Object> params){
		List<UserBean> users = (List<UserBean>) params.get("users");
		StringBuffer sb = new StringBuffer();
		sb.append("insert into t_user (user_name,age,pwd,login_name) values ");
		for (UserBean userBean : users) {
			sb.append("('"+userBean.getUserName()+"','"+userBean.getAge()+"','"+userBean.getPassword()+"','"+userBean.getLoginName()+"'),");
		}
		String sql = sb.toString();
		return sql.substring(0, sql.length()-1);
	}
	
	
	/**
	 * 
	 * @param params 来至于调用方法  
	 * @return 需要执行的SQL语句
	 */
	public String batchDeleteUserInfo(Map<String,Object> params){
		Long[] ids = (Long[]) params.get("array");
		StringBuffer sb = new StringBuffer();
		sb.append("delete from t_user where id in (");
		
		for (Long id : ids) {
			sb.append("'"+id+"',");
		}
		String sql = sb.toString();
		sql = sql.substring(0, sql.length()-1);
		sql += ")";
		return sql;
	}
	
	
	
	
}
