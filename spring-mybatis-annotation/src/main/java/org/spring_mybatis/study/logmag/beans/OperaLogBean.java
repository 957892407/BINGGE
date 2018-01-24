package org.spring_mybatis.study.logmag.beans;

import java.io.Serializable;
import java.util.Date;

public class OperaLogBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4594725739979625116L;
	private Long id;
	private String userName;
	private Date operTime;
	private String model;
	private Integer operType;
	private String datas;
	public OperaLogBean() {
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
	public Date getOperTime() {
		return operTime;
	}
	public void setOperTime(Date operTime) {
		this.operTime = operTime;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getOperType() {
		return operType;
	}
	public void setOperType(Integer operType) {
		this.operType = operType;
	}
	public String getDatas() {
		return datas;
	}
	public void setDatas(String datas) {
		this.datas = datas;
	}
	@Override
	public String toString() {
		return "OperaLogBean [id=" + id + ", userName=" + userName + ", operTime=" + operTime + ", model=" + model
				+ ", operType=" + operType + ", datas=" + datas + "]";
	}
}
