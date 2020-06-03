import java.util.*;
class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;	
	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}		
	public int getId() {
		return id;
	}
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
public class Prog5 {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		
		l.add(new Employee(100, "John", "Address1", 10000.0));
		l.add(new Employee(101, "Alice", "Address2", 20000.0));
		l.add(new Employee(102, "Mark", "Address3", 3000.0));
		l.add(new Employee(103, "Willam", "Address4", 40000.0));
		
		Iterator<Employee> i = l.iterator();
		int searchId = 101;
		while (i.hasNext()) {
			Employee emp = i.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}
