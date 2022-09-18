package p2ch5hw1;

public abstract class Employee{
	protected int no;
	protected String name;
	protected int year;
	protected String department;
	
	public static final int BASE_SALARY = 5000;
	
	public Employee(int no, String name, int year, String department){
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;
	}
	
	public Employee(int no, String name, int year){
		this(no, name, year, null);
	}
	
	public abstract void work();

	public double calculateSalary(){
		return year * BASE_SALARY ;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		String s = "No:" + no + " Name:" + name + " Year:" + year + " Department:" + department ;
		return s;
	}
}