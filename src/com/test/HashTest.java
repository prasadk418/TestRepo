package com.test;

import java.util.HashMap;

public class HashTest {
public static void main(String[] args) {
	

	Employee e1=new Employee(101, "prasad");
	Employee e2=new Employee(101, "prasad");
	System.out.println(e1.hashCode() + " -- "+e2.hashCode());
	System.out.println(e1.equals(e2));
	HashMap h=new HashMap<Employee, Employee>();
	h.put(e1, e1);
	h.put(e2, e2);
	System.out.println(h.size());
}
}