package application;

import java.util.Locale;
import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos terá o vetor?");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		System.out.println("Digite os elementos do vetor: ");
		for (int i = 0; i < vect.length; i++) {
			vect[i] =sc.nextDouble();
		}
		
		//soma dos elementos
		double soma = 0.0;
		
		for (int i =0; i < vect.length; i++) {
			soma = soma + vect[i];
		}
		
		//media dos elementos
		double media = soma /n;
		
		System.out.printf("Media dos Elementos do Vetor : %.3f\n", media);
		
		//Elementos abaixo da media
		System.out.println("Elementos abaixo da média: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f\n", vect[i]);
			}
		}
		
		
		
				
		
		
		sc.close();

	}

}
