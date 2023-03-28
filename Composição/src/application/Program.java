package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Entre com os dados do trabalhador: ");
		
		System.out.println("Nome: ");
		String workerName = sc.nextLine();
		System.out.println("Nível: ");
		String workerLevel = sc.nextLine();
		System.out.printf("Salário Base: \n");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel),baseSalary,new Department(departmentName));
		
		System.out.print("Quantos contratos tem o trabalhador? ");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			
			System.out.println("Entre com os dados do  contrato ");
			System.out.println("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Duração (horas): ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.println("Entre com o mês e o ano para calcular os ganhos (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt((monthAndYear).substring(0,2));
		int year = Integer.parseInt((monthAndYear).substring(3));
		
		
		System.out.println("-----------------------------------");
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartment().getName());
		System.out.println("Ganhos para " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
