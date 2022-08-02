package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		//System.out.print("Quantidade em estoque: ");
		//int quantity = sc.nextInt();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		//Product product = new Product(name,price,quantity);
		Product product = new Product (name, price);
		
		//product.name ="Computer"; nao pode acessar diretamente devido ao private
		
		product.setName("Computer");
		System.out.println("Updated name : " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Updated price : " + product.getPrice());
		
		
		
		System.out.println();
		System.out.print("Dados do Produto: " + product);
		
		System.out.println();
		System.out.print("Digite o número de produtos a serem adicionados ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts (quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ product);
		
		System.out.println();
		System.out.print("Digite o número de produtos a serem removidos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts (quantity);
		
		System.out.println();
		System.out.println("Dados atualizados: "+ product);
		
		sc.close();
		
		
		
		
		
		
		
				
				

	}

}
