//Faça um código que some duas matrizes de inteiras de tamanhos iguais

package exercicios_matriz;

public class Exer3 {

	public static void main(String[] args) {

		int[][] matriz1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] matriz2 = { { 9, 8, 7 }, { 6, 5, 4 }, { 3, 2, 1 } };

		int linhas = matriz1.length;
		int colunas = matriz1[0].length;

		int[][] matrizSoma = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
			}
		}

		System.out.println("Matriz Soma:");
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matrizSoma[i][j] + " ");
			}
			System.out.println();
		}
	}
}