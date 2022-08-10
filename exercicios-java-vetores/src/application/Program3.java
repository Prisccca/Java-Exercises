package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ClassP3;




public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int N = sc.nextInt();
		
		ClassP3[] vect = new ClassP3[N];
		
		for (int i = 0; i < vect.length; i++ ) {
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vect[i] = new ClassP3(name,age,height);
		}
		
		//altura média
		
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getHeight();
			}
		
		double media = sum / vect.length;
		
		System.out.printf("Altura média: %.2f%n", media);
		
		//Percentagem menores de 16
		
		int menos16 = 0;
		System.out.println("Menores de 16:");
		for (int i = 0; i < vect.length; i++) {
			
			if ( vect[i].getAge() < 16) {
				menos16++;
				System.out.printf("%s\n", vect[i].getName());
			}
		}
		double percentualMenores = ((double) menos16/N ) *100;
		System.out.printf("Pecentual com menos de 16 anos: %.2f%%\n", percentualMenores);
		
		
		
		
		sc.close();
		

	}

}
