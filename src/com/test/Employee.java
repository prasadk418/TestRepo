package com.test;

import java.util.HashMap;

public class Employee {
	
	private Integer id;
	private String name;
	
	Employee(Integer id, String name){
		this.id=id;
		this.name=name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//---------------Case1----------
	/*
	 * hashCode and equals methods not overriden
	 *  Employee e1=new Employee(101, "prasad");
     *  Employee e2=new Employee(101, "prasad");
	 * HashMap h=new HashMap<Employee, Employee>();
	 * h.put(e1, e1);
	 * h.put(e2, e2);
	 * h has two objects those are duplicates
	 */
	
	
	
	//---------------Case2----------
	/*
	 * Only hashCode method is overriden
	 * 
	 * @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	
	 *  Employee e1=new Employee(101, "prasad");
     *  Employee e2=new Employee(101, "prasad");
	 * HashMap h=new HashMap<Employee, Employee>();
	 * h.put(e1, e1);
	 * h.put(e2, e2);
	 * h has two objects those are duplicates
	 * 
	 * NOTE: even we override the hashcode method with same value, HASHMAP depends on equals 
	 * method, so again hashmap has duplicate objects
	 */
	
	
	//---------------Case3----------
		/*
		 * Only equals method is overriden
		 * 
		 * @Override
		@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee ee=(Employee)obj;
				
		return this.id == ee.getId();
	}
	 *  Employee e1=new Employee(101, "prasad");
     *  Employee e2=new Employee(101, "prasad");
	 * HashMap h=new HashMap<Employee, Employee>();
	 * h.put(e1, e1);
	 * h.put(e2, e2);
	 * h has two objects those are duplicates
	 * 
	 * NOTE: even we override the equals, but these objs has diff hascodes
	 *  so again hashmap has duplicate objects
	 */
	
	
	//---------------Case4----------
	/*
	 * 
	 * now the hashmap has only one object
	 * Good/real implementation
	 */
	
	 @Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return this.id;
		}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Employee ee=(Employee)obj;
				
		return this.id == ee.getId();
	}
	
	
	
}
