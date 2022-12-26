package prob04;

public class Depart extends Employee {
	private String department;
	public Depart(String name, int salary, String department) {
		super(name,salary);
		this.department=department;
	}
	
	@Override
	public void getInformation() {
		System.out.printf("이름: %s   연봉: %d   부서: %s\n", getName(), getSalary(),getDepartment());
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}
