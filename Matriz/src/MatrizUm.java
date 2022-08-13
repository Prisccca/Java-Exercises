import java.util.Scanner;

public class MatrizUm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da matriz? ");
		int n = sc.nextInt();
		
		int [][] mat = new int [n][n];
		
		//linhas
		for (int i = 0; i < mat.length; i++) {
			
			//colunas
			
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
			}
			
		}
		
		//diagonal principal
		System.out.println("Diagonal Principal: ");
		for ( int i = 0; i < mat.length ; i ++) {
			System.out.print(mat [i][i] + " ");
		}
		
		System.out.println();
		//imprmir negativos
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if ( mat[i][j] < 0) {
					count++;
				}
			}
			
		}
		
		System.out.println("Negativos = " + count);
		
		
		
		
		
		sc.close();

	}

}
