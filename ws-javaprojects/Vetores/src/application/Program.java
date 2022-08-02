package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Digite as alturas?");
			vect[i]=sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum += vect[i];
		}
		
		double media = sum / N;
		
		System.out.printf("A média das alturas é : %.2f%n" ,  media);
		
		
		sc.close();
		

	}

}
