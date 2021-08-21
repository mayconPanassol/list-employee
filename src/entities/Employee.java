package entities;

public class Employee {

	private final Integer id;
	private String name;
	private Double salary;

	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void addName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void addSalary(Double salary) {
		this.salary = salary;
	}

	public void increaseSalary(Double porcent) {
		this.salary = salary + salary * porcent;
	}

	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f\n", salary);

	}

}
