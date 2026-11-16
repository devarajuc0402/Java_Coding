package Coding;

import java.util.List;

import streams.employee.Employee;

public class SecondMaxSalEmpInLoop {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		double max = Double.MIN_VALUE;
		double secondMax = Double.MIN_VALUE;
		
		for(int i=0;i<list.size();i++) {

			double temp = list.get(i).salary;
			if(temp > max) {
				secondMax = max;
				max = temp;
			}
			else if(max > temp && temp > secondMax && secondMax != max) {
				secondMax = temp;
			}
		}
		System.out.println(max);
		System.out.println(secondMax);
	}
}
