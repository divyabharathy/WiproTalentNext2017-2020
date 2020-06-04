public class Prog4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("John");
		Employee eClone = e.clone();
		eClone.setName("William");
		System.out.println(e.getName());
		System.out.println(eClone.getName());
	}
}
class Employee implements Cloneable{
	private String n;
	public Employee(String name) {
		this.n = name;
	}
	public String getName() {
		return n;
	}
	public void setName(String name) {
		this.n = name;
	}
	public Employee clone() throws CloneNotSupportedException {
			return (Employee) super.clone();
	}
}
