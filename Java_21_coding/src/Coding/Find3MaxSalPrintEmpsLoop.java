package Coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import streams.employee.Employee;

public class Find3MaxSalPrintEmpsLoop {

	public static void main(String[] args) {
		
		List<Employee> list = new Employee().getValues();
		System.out.println(list);
		
		double first = Double.MIN_VALUE;
		double second = Double.MIN_VALUE;
		double third = Double.MIN_VALUE;
		
		for(int i=0;i<list.size();i++) {
			
			double temp = list.get(i).salary;
			
			if(temp > first) {
				third = second;
				second = first;
				first = temp;
			}
			else if(first > temp && second < temp) {
				third = second;
				second = temp;
			}
			else if(second > temp && third < temp) {
				third = temp;
			}
		}
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		List<Employee> firstList = new ArrayList<Employee>();
		List<Employee> secondList = new ArrayList<Employee>();
		List<Employee> thirdList = new ArrayList<Employee>();
		
		for(int i=0;i<list.size();i++) {
			
			double temp = list.get(i).salary;
			if(temp == first) {
				firstList.add(list.get(i));
			}
			else if(temp == second) {
				secondList.add(list.get(i));
			}
			else if(temp == third) {
				thirdList.add(list.get(i));
			}
		}
//		System.out.println(firstList);
		
		Map<Double, List<Employee>> map = Map.of(
				first, firstList,
				second, secondList,
				third, thirdList
		);
		
		System.out.println(map);
	}
}
