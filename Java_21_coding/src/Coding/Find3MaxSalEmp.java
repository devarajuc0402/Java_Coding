package Coding;

import java.util.List;

import streams.employee.Employee;

public class Find3MaxSalEmp {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		double first = Double.NEGATIVE_INFINITY;
		double second = Double.NEGATIVE_INFINITY;
		double third = Double.NEGATIVE_INFINITY;
		
		for(int i=0;i<list.size();i++) {
			
			double temp = list.get(i).salary;
			
			if(temp > first) {
				third = second;
				second = first;
				first = temp;
			} 
			else if(first > temp && second < temp) {
				second = temp;
			}
			if(second > temp && third < temp) {
				third = temp;
			}
		}
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
