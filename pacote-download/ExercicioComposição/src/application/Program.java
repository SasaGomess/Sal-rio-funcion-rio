package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Enter department's name (Insira o nome do departamento): ");
		String departmentName = sc.next();
		
		System.out.println("--------------------------------------------------------");
		System.out.println("Enter worker data (Insira os dados do funcionário): ");


		sc.nextLine();
		
		System.out.print("Name (Nome): ");
		String workerName = sc.nextLine();
		
		System.out.println("--------------------------------------------------------");
		System.out.print("JUNIOR, MID_LEVEL OR SENIOR ");
		System.out.print("Level (Nível): ");
		
		String workerLevel = sc.nextLine();
		System.out.println("--------------------------------------------------------");

		System.out.print("Base salary (Base salarial): ");
		Double baseSalary = sc.nextDouble();
		System.out.println("--------------------------------------------------------");

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker?(Quantos contratos esse funcionário tem?) ");
		Integer N = sc.nextInt();
		
		System.out.println("--------------------------------------------------------");

		
		for (int i=1; i <= N; i++) {
			System.out.println("Enter contract #" + i + " data :) ");
			System.out.println("--------------------------------------------------------");
			sc.nextLine();
			System.out.print("Date (DD/MM/YYYYY): ");
			String data1 = sc.nextLine();
			System.out.println("--------------------------------------------------------");

			LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			
			System.out.print("Value per hour (Valor por hora): ");
			Double valueHour = sc.nextDouble();
			System.out.println("--------------------------------------------------------");

			System.out.print("Duration (Duração): ");
			Integer duration =  sc.nextInt();
			System.out.println("--------------------------------------------------------");

			HourContract contract = new HourContract(contractDate, valueHour, duration);
			worker.addContract(contract);
		}
		System.out.println("<3 <3 <3 <3 <3 <3 <3 <3 NOW I WILL CALCULATE YOUR INCOME <3 <3 <3 <3 <3 <3 <3 <3 <3");

		System.out.println("--------------------------------------------------------");
		System.out.print("Now enter month and year to calculate income (Agora, insira o mês e ano para calcular o salário: ) (MM/YYYY): ");
		String monthAndYear = sc.next();
		
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Level: " + worker.getLevel());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
