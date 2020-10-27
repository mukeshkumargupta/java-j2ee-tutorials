package com.tutorials.java.collections.examples;

import java.util.HashMap;
import java.util.Map;
class Employee {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	private String  id;
	private Integer salary;
	public Employee(String id, Integer salary) {
		this.id = id;
		this.salary = salary;
	}
}


public class MapExample {

	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<Employee, String>();
		Employee e1 = new Employee("mukesh", 12345);
		Employee e2 = new Employee("mukesh", 12345);
		map.put(e1, "India");
		map.put(e2, "Srilanka");
		//e2.setId("shyam");
		//e1.setId("anjani");
		System.out.println(map.get(e1));
		System.out.println(map.get(e2));

	}

}
