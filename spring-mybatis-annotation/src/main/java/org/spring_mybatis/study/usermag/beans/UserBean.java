package org.spring_mybatis.study.usermag.beans;

import java.io.Serializable;

public class UserBean implements Serializable,Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6877575596685917577L;
	private Long id;
	private String userName;
	private Integer age;
	private String password;
	private String loginName;
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", age=" + age + ", password=" + password
				+ ", loginName=" + loginName + "]";
	}
}
