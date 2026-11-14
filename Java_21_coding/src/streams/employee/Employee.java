package streams.employee;

import java.util.Arrays;
import java.util.List;

class Employee {
    int id;
    String name;
    String department;
    double salary;
    
    public Employee() {}
    		
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public List<Employee> getValues() {
		
		return Arrays.asList(
				new Employee(3, "Arun", "IT", 75000.0),
				new Employee(5, "Ravi", "HR", 55000.0),
				new Employee(1, "Kumar", "IT", 90000.0),
				new Employee(4, "Priya", "HR", 65000.0),
				new Employee(2, "Jo", "Fie", 80000.0),
				new Employee(2, "John", "Finance", 80000.0),
				new Employee(1, "Raj", "IT", 100000.0)
		);		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]\n";
	}

	public static void main(String[] args) {
		
		System.out.println(new Employee().getValues());
	}
	
}
