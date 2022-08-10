package application;

import java.util.Locale;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i]= sc.nextDouble();			
		}
		
		//maior valor do vetor e sua posição
		 double maior = vect[0];
		 int posMaior = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > maior ){
				maior = vect[i];
				posMaior = i;
				
			}
		}
		
		System.out.printf("O maior valor do vetor é : %.2f\n",maior);
		System.out.printf("A posição do maior valor do vetor é : %d\n",posMaior);
		
		
		
		
		sc.close();
		
		

	}

}
