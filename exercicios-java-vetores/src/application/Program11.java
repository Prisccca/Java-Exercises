package application;

import java.util.Locale;
import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos pessoas você vai digitar?");
		int n = sc.nextInt();
		
		//dados das pessoas
		char[] genero = new char[n];
		double[]  altura = new double[n];
		
		
		for (int i = 0; i < n; i++ ) {
			System.out.printf("Dados da %da pessoa: \n", i + 1);
			System.out.print("Genero: ( M ou F ");
			genero[i]=sc.next().charAt(0);
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		//alturas
		double menorAltura = altura[0];
		double maiorAltura = altura[0];
		
		for ( int i =0 ; i < n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
		}
		
		//quantidades e media
		
		int qtdeH = 0;
		int qtdeM = 0;
		double alturaMediaM, somaAlturasM = 0;
		
		for ( int i = 0; i < n ; i++) {
			if (genero[i] == 'M') {
				qtdeH++;
			}
			else {
				qtdeM++;
				somaAlturasM = somaAlturasM + altura[i];
				
			}
		}
		
		alturaMediaM = somaAlturasM / qtdeM;
		
		System.out.printf("Menor Altura = %.2f\n",menorAltura);
		System.out.printf("Maior Altura = %.2f\n",maiorAltura);
		System.out.printf("Media de Alturas das Mulheres = %.2f\n",alturaMediaM);
		System.out.printf("Quantidade de homens = %d\n",qtdeH);
		
		
		
		
		
		sc.close();

	}

}
