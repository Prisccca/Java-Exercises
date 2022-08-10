package application;

import java.util.Locale;
import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas você vai digitar?");
		int n = sc.nextInt();
		
		//vetores
		String[] names = new String[n];
		int[]  idade = new int[n];
		
		for (int i = 0; i < n; i++ ) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			System.out.print("Nome: ");
			names[i]=sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		//logica maior idade
		int maiorIdade = idade[0];
		int posicaoMaior = 0;
		
		for (int i = 1; i < n; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				posicaoMaior = i;
					
			}
		}
		System.out.printf("Pessoa mais velha é: %s\n", names[posicaoMaior]);
		
		
		
		
		
		
		
		
		sc.close();

	}

}
