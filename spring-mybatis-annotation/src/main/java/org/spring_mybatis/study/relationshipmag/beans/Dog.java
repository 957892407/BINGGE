package org.spring_mybatis.study.relationshipmag.beans;

public class Dog extends Pet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3899089777325504517L;

	private Integer bone;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(Integer bone) {
		super();
		this.bone = bone;
	}

	public Integer getBone() {
		return bone;
	}

	public void setBone(Integer bone) {
		this.bone = bone;
	}

	@Override
	public String toString() {
		return "Dog [id=" + getId() + ", name=" + getName() + ", bone=" + bone + "]";
	}
}
