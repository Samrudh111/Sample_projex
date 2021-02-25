package emp_sort;

import java.util.Comparator;

public class EmployeeSortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int diff = o1.getEmp_name().compareTo(o2.getEmp_name());
		return diff;
	}

}
