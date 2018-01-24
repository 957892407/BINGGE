package org.spring_mybatis.study.relationshipmag.beans;

import java.io.Serializable;

public class Pet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4684802625932356471L;

	private Long id;
	private String name;
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + "]";
	}
}
