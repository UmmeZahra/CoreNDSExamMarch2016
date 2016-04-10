package oop.design;

public class EmployeeInfo extends EmployeeDitale implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	static String address;
	final static String federalHolyday = "X-Mas";
	private String name;
	private int employeeId;
	private String designation;
	String shift = "shift_2";
	double performance;
	int year;
	@SuppressWarnings("unused")
	private long ssn; // can't be used in other classes

	/*
	 * You must implement the logic for below 2 methods and following 2 methods
	 * are prototype as well for other methods need to be design, as you will
	 * come up with the new ideas. you must have multiple constructor. Must
	 * implement below constructor.
	 */
	public EmployeeInfo() {

	}

	public EmployeeInfo(int employeeId) {
		this.employeeId = employeeId;
	}

	public EmployeeInfo(String name) {
		this.name = name;
	}

	public EmployeeInfo(String name, int employeeId) {

		this.name = name;
		this.employeeId = employeeId;
	}

	/*
	 * This methods should calculate Employee bonus based on salary and
	 * performance. Then it will return the total yearly bonus. So you need to
	 * implement the logic. Hints: 10% of the salary for best performance, 8% of
	 * the salary for average performance and so on. You can set arbitrary
	 * number for performance. So you probably need to send 2 arguments.
	 */
	public static double calculateEmployeBonus(int salary, double performance) {

		double total = 0;
		total = salary * performance;
		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and
	 * numbers of years with the company. Then it will return the total pension.
	 * So you need to implement the logic. Hints: pension will be 5% of the
	 * salary for 1 year, 10% for 2 years with the company and so on. So you
	 * probably need to send 2 arguments.
	 */
	public static double calculateEmployePension(double salary, int year) {

		double pensionTotal = 0;
		if (year == 1) {
			pensionTotal = salary * 0.05;
		} else if (year == 2) {
			pensionTotal = salary * 0.1;
		} else if (year == 3) {
			pensionTotal = salary * 0.15;
		}
		return pensionTotal;
	}

	/*
	 * public double calculateOverTime(double hour){
	 *
	 * double overTimePay = hour*overTimeRate; return overTimePay; }
	 */

	// below 5 methods are from interface Employee
	public int employeeId() {

		return employeeId;
	}

	public String employeeName() {

		return name;
	}

	public void assignDepartment(String department) {

		System.out.println("Assigned Department: " + department);
	}

	public double calculateSalary(int sal) {

		double salary = sal;
		return salary;
	}

	public void benefitLayout(String benefit) {

		System.out.println("Benefit Package: " + benefit);
	}

	// below 5 methods are from abstract class EmployeeType
	public double calPerformance() {
		performance = 0.1;
		return performance;
	}

	public void fullTime() {
		System.out.println("Employment Status: Full Time");
	}

	public void partTime() {
		System.out.println("Employment Status: Part Time");
	}

	public void email(String email) {
		System.out.println("Email: " + email);
	}

	public void contactNo(long number) {
		System.out.println("ContactNumber: " + number);
	}

	// Accessing private variables using getter/setter
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	// Static method and static variable
	public static void holyDay() {
		System.out.println("\nEveryone will have Merry " + federalHolyday
				+ " break...:)");
	}

	// Polymorphism
	@Override
	public void getClearance() {
		System.out
				.println("Few Employees Must Obtain Secret Security Clearance");
	}

	// Super keyword
	void printNotice() {
		System.out.println("8am-4pm: " + super.shift);
		System.out.println("4pm-12am: " + shift);
		super.getClearance();
		getClearance();
	}
}
