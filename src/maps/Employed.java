package maps;

public class Employed {

	String name;
	int salary;
	public Employed(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employed [name=" + name + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}


}
