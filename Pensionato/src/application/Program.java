package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguek;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguek[] vect = new Aluguek[10];
		
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		//leitura dos dados
		for (int i = 1; i <= n ; i++) {
			System.out.println("Aluguel # " + i + " : " );
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int roomNumber = sc.nextInt();
			vect[roomNumber] =  new Aluguek(name, email);
		}
		
		System.out.println();
		System.out.println("Quartos Ocupados: ");
		for (int i = 0; i < 10; i++) {
			
			if( vect[i] != null) {
			System.out.println(i + " : " +vect[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
