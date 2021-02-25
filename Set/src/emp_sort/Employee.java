package emp_sort;

public class Employee implements Comparable<Employee>{
	int emp_id;
	String emp_name;
	double emp_sal;
	public Employee(int emp_id, String emp_name, double emp_sal) {
		this.emp_id=emp_id;
		this.emp_name=emp_name;
		this.emp_sal=emp_sal;
	}
	public double getEmp_sal() {
		return emp_sal;
	}
	public void setEmp_sal(double emp_sal) {
		this.emp_sal = emp_sal;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	@Override
	public int compareTo(Employee o) {
		//int diff = this.emp_name.compareTo(o.getEmp_name());
		int diff = this.emp_id - o.getEmp_id();
		return diff;
	}
}	