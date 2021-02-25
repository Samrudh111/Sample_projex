package emp_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Employee_list {

	public static void main(String[] args) {
		ArrayList <Employee>emp = new ArrayList<>();
		emp.add(new Employee(123,"sam",3324.4));
		emp.add(new Employee(423,"ram",33324.4));
		emp.add(new Employee(323,"pam",4324.4));
		emp.add(new Employee(223,"aam",324.4));
		System.out.println("SORTING:");
		Scanner sc = new Scanner(System.in);
		int op;
		boolean flag = true;
		while(flag) {
			System.out.println("Choose one option:\n");
			System.out.println("1.Sort by Employee ID\n2.Sort by Employee Name\n3.Sort by Employee Salary\n4.EXIT");
			op = sc.nextInt();
			switch(op) {
			case 1:
				Collections.sort(emp, new EmployeeSortByEmployeeID());
				for(Employee e : emp) {
					System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_sal());
				}
				break;
			case 2:
				Collections.sort(emp, new EmployeeSortByName());
				for(Employee e : emp) {
					System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_sal());
				}
				break;
			case 3:
				Collections.sort(emp, new EmployeeSortByEmployeeSalary());
				for(Employee e : emp) {
					System.out.println(e.getEmp_id()+" "+e.getEmp_name()+" "+e.getEmp_sal());
				}
				break;
			case 4 : flag = false;
			break;
			default:
				System.err.println("Incorrect input\n");
				break;
			}
		}
		
	}

}
