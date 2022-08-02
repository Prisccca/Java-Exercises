package application;

import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você irá digitar?");
		int N = sc.nextInt();
		
		int[] vect = new int[N];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um número: ");
			vect[i]= sc.nextInt();			
		}
		
		//quantidade de pares
		int quantPares = 0;
		System.out.println("Numeros Pares: \n");
		for ( int i= 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				quantPares ++;
				System.out.printf("%d ," ,vect[i]);
				
				
			}
			
			
		}
		System.out.printf("Quantidades de Pares: %d \n",quantPares);
		
		sc.close();

	}

}
