package org.spring_mybatis.study.relationshipmag.beans;

public class Cat extends Pet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6678126165653874642L;

	private Integer fish;

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(Integer fish) {
		super();
		this.fish = fish;
	}

	public Integer getFish() {
		return fish;
	}

	public void setFish(Integer fish) {
		this.fish = fish;
	}

	@Override
	public String toString() {
		return "Cat [id=" + getId() + ", name=" + getName() + ", fish=" + fish + "]";
	}
	
	
	
}
