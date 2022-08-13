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
		
		List<Employee> list = new ArrayList<>();
		
		//quantidade de funcionários
		System.out.print("Quantos funcionários serão registrados?");
		int N = sc.nextInt();
		
		
		//Entrada de dados dos funcionários: id , nome, salário
		
		for ( int i = 0; i < N; i++ ) {
			
			System.out.println();
			System.out.println("Funcionário # " + (i + 1) + " : ");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			//Para não repetir o ID
			while (hasId(list,id)) {
				System.out.println("ID já existe! Tente novamente: ");
				id = sc.nextInt();
				
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name =sc.nextLine();
			System.out.print("Salário : ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id , name, salary);
			
			list.add(emp);
			
		}
		
		// Aumento do salário
		
		System.out.println();
		System.out.print("Digite o id do funcionário que receberá aumento: ");
		int idSalary = sc.nextInt();
		
		// Integer pos = position(list, idsalary);
		Employee emp = list.stream().filter( x -> x.getId() == idSalary).findFirst().orElse(null);
		
		// if (pos == null) {
		if (emp == null ) {
			System.out.println("Este ID não existe!");
		} else {
			//caso id exista
			System.out.print("Digite o valor da porcentagem: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		//mostrar a lista de funcionários
		System.out.println();
		System.out.println ("Lista de Funcionários: ");
		for ( Employee e :list) {
			System.out.println(e);
		}
		
		sc.close();
		
		 
	}
	//funções/ 
	
	public static boolean hasId (List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
	//encontrar a posição do id na lista
	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}

