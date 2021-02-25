package emp_sort;

import java.util.Comparator;

public class EmployeeSortByEmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		double diff = o1.getEmp_sal() - o2.getEmp_sal();
		return (int) diff;
	}

}
