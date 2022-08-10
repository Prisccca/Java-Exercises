package application;

import java.util.Locale;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos você vai digitar?");
		int n = sc.nextInt();
		
		//alunos, notas
				String[] alunos = new String[n];
				double[]  nota1 = new double[n];
				double[]  nota2 = new double[n];
				
				for (int i = 0; i < n; i++ ) {
					System.out.printf("Dados do %do aluno: \n", i + 1);
					System.out.print("Nome: ");
					alunos[i]=sc.next();
					System.out.print("Nota 1: ");
					nota1[i] = sc.nextDouble();
					System.out.print("Nota 2: ");
					nota2[i] = sc.nextDouble();
				}
				
				//media e aprovados
				
				double[] media = new double[n];
				System.out.println("Alunos aprovados:");
				
				for (int i = 0; i < n; i++) {
					media[i] = (nota1[i] + nota2[i])/2;
					
					if (media[i] >= 6.0) {
						System.out.printf("%s\n", alunos[i]);
						System.out.printf("%.2f\n", media[i]);
						
					}
				}
				
		
		
		sc.close();

	}

}
