package org.spring_mybatis.study.relationshipmag.beans;

import java.io.Serializable;
import java.util.List;

public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -97472230872246554L;

	private Long id;
	private String roleName;
	
	private List<Person> persons;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", persons=" + persons + "]";
	}
}
