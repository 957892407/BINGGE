package org.spring_mybatis.study.relationshipmag.beans;

import java.io.Serializable;

public class Husband implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 319853495554395885L;
	private Long id;
	private String name;
	
	private Wife wife;

	public Husband() {
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

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [id=" + id + ", name=" + name + ", wife=" + wife + "]";
	}
}
