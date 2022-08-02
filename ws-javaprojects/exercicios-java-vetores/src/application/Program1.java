package application;

import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println ("Digite a quantidade de números ?");
			int N = sc.nextInt();
			
			int[] vect = new int[N];
			
			for ( int i = 0; i < vect.length; i++) {
				System.out.println("Digite o número? positivo ou negativo");
				vect[i] = sc.nextInt();
				}
			
			System.out.println("números negativos: ");
			
			for (int i = 0; i < vect.length; i++) {
				
				if (vect[i] <0) {
					System.out.printf("%d\n", vect[i]);
				}
				
			}
			
			
		sc.close();
		

	}

}
