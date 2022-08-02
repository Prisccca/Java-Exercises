package application;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de elementos do vetor?");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		//elementos do vetor
		for (int i=0; i<N; i++) {
			System.out.println("Digite os elementos do vetor?");
			vect[i]=sc.nextDouble();
		}
		
		//mostrar os elementos
		for (int i=0; i<N; i++) {
			System.out.printf("[ " + vect[i] +" ]\n");
		}
		
		//soma
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			sum += vect[i];
		}
		
		System.out.printf("Soma dos elementos: %.2f\n", sum);
		
		//media
		double media = sum / N;
		sc.nextLine();
		System.out.printf("A média das alturas é : %.2f\n" ,  media);
		
		sc.close();

	}
	
	

}
