/**
 * 
 */
package com.fsoft.template.request;

/**
 * @author YenDV
 *
 */
public class TestApiRequest {
	//private Long id;
	private String name;
	private String age;
	
	/**
	 * 
	 */
	public TestApiRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public TestApiRequest(Long id, String name, String age) {
		super();
		//this.id = id;
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

}