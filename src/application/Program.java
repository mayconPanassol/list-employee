package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registered? ");
		int quantityRegister = sc.nextInt();
		System.out.println();
		
		List<Employee> listEmployee = new ArrayList<Employee>();

		for (int i = 0; i < quantityRegister; i++) {
			System.out.println("Emplyoee: #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			listEmployee.add(new Employee(id, name, salary));

			System.out.println();
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		sc.nextLine();

		int teste = 0;

		for (Employee x : listEmployee) {
			if (x.getId() != id) {
			teste += 1;
			}
		}

		if (teste == listEmployee.size()) {
		System.out.println("This id does not exist!");
			
		} else {
			System.out.print("Enter the percentage: ");
			double porcent = sc.nextDouble();
			sc.nextLine();

			for (Employee x : listEmployee) {
				if (x.getId() == id) {
				x.increaseSalary(porcent);
				}
			}

		}

		System.out.println();
		System.out.println("List of employees:");

		for (Employee x : listEmployee) {

			System.out.print(x.toString());

		}

		sc.close();

	}

}
