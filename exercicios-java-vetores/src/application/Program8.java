package application;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos terá o vetor");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		double soma = 0;
		int pares = 0;
		
		System.out.println("Digite o valor dos vetores: ");
		
		for (int i = 0; i < vect.length; i++) {
			vect[i]=sc.nextInt();
		}
		
		//Pares
		
		for (int i = 0; i < vect.length; i++) {
		if (vect[i] % 2 == 0) {
			 soma = soma + vect[i];
			 pares++;
			 
		  }
		}
		
		//media dos pares ou nenhum
		if (pares == 0) {
			System.out.println("Nenhum numero par digitado");
		} 
		else {
			double mediaPares = soma/pares;
			 System.out.printf("Media dos Pares: %.1f\n ",mediaPares);
		}
		
		
		sc.close();

	}

}
