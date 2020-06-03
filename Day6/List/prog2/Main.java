import java.util.*;

public class Main {
	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		Employee1 emp1 = new Employee1(100, "John", "john@mail.com", 'M', 10000);
		Employee1 emp2 = new Employee1(101, "William", "wil@mail.com", 'M', 30000);
		Employee1 emp3 = new Employee1(102, "Olivia", "olivia@mail.com", 'F', 20000);
		Employee1 emp4 = new Employee1(103, "Eliz", "eliz@mail.com", 'F', 40000);

		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);

		for (Employee1 emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());

		System.out.println();
		empDb.deleteEmployee(102);

		for (Employee1 emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());

		System.out.println();

		System.out.println(empDb.showPaySlip(103));
	}

}
