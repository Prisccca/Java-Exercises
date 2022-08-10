package application;

import java.util.Scanner;

public class Programa6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos valores você irá digitar? ");
		int N = sc.nextInt();
		
		//vetor A
		int[] vectA = new int[N];
		System.out.println("Digite os valores do vetor A?");
		for ( int i = 0; i < vectA.length; i++) {
			vectA[i] = sc.nextInt();
		}
		
		//vetorb
		int[] vectB = new int[N];
		System.out.println("Digite os valores do vetor B?");
		for ( int i = 0; i < vectB.length; i++) {
			vectB[i] = sc.nextInt();
		}
		
		//vetor C
		
		int[] vectC = new int[N];
		for (int i = 0; i < vectC.length; i++ ) {
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("O vetor resultante é: ");
		for (int i = 0; i < vectC.length; i++) {
			System.out.printf("%d\n ", vectC[i]);
		}
		
		sc.close();

	}

}
