import java.util.Scanner;

public class MatrizDois {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o numero de linhas da matriz?");
		int N = sc.nextInt();
		System.out.println("digite o numero de colunas da matriz?");
		int M = sc.nextInt();
		
		int[][] matriz = new int[M][N];
		
		System.out.println("Digite os elementos da matriz?");
		
		for ( int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		//ler um dos numeros pertencente a matriz
		System.out.println("Digite um elemento da matriz?");
		int x = sc.nextInt();
		
		//mostrar os elementos acima abaixo direita esquerda
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				if (matriz[i][j] == x) {
					System.out.println("Posição " + i + " , " + j + " : ");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j - 1]);
					}
					
					if (i > 0) {
						System.out.println ("Acima: " + matriz[i -1][j]);
					}
					
					if (j < matriz[i].length -1) {
						System.out.println ("Direita: " + matriz[i][j + 1]);
					}
					
					if ( i < matriz.length - 1) {
						System.out.println("Abaixo: " + matriz[i +1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
