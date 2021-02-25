package emp_sort;

import java.util.TreeSet;

public class Emp_sort {

	public static void main(String[] args) {
		TreeSet <Employee>emp1 = new TreeSet<>();
//		emp1.add(new Employee(1234,"sam"));
//		emp1.add(new Employee(4234,"ram"));
//		emp1.add(new Employee(3234,"aam"));
//		emp1.add(new Employee(2234,"cam"));
		for(Employee e1 : emp1) {
			System.out.println(e1.getEmp_id()+e1.getEmp_name());
		}
	}

}
