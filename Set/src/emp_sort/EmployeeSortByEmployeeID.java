package emp_sort;

import java.util.Comparator;

public class EmployeeSortByEmployeeID implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int diff = o1.getEmp_id() - o2.getEmp_id();
		return diff;
	}

}
