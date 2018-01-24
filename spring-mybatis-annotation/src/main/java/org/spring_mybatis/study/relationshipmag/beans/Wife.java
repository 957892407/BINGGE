package org.spring_mybatis.study.relationshipmag.beans;

import java.io.Serializable;

public class Wife implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6316843068148880464L;
	private Long id;
	private String name;
	
	private Husband hus;

	public Wife() {
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

	public Husband getHus() {
		return hus;
	}

	public void setHus(Husband hus) {
		this.hus = hus;
	}

	@Override
	public String toString() {
		return "Wife [id=" + id + ", name=" + name + ", hus=" + hus + "]";
	}
	
	
}
