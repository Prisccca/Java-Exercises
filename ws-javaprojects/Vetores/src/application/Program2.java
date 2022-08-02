package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de produtos? ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
			}
		
		double media = sum / vect.length;
		
		System.out.printf("Preço médio dos produtos: %.2f%n", media);
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
