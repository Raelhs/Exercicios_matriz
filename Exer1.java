package exercicios_matriz;

public class Exer1 {

	public static void main(String[] args) {

		

		int[][] matrizLucro = new int[12][2];

		matrizLucro[0][0] = 1;
		matrizLucro[0][1] = 2000;
		matrizLucro[1][0] = 2;
		matrizLucro[1][1] = 1500;
		matrizLucro[2][0] = 3;
		matrizLucro[2][1] = 2200;
		matrizLucro[3][0] = 4;
		matrizLucro[3][1] = 1800;
		matrizLucro[4][0] = 5;
		matrizLucro[4][1] = 2500;
		matrizLucro[5][0] = 6;
		matrizLucro[5][1] = 2100;
		matrizLucro[6][0] = 7;
		matrizLucro[6][1] = 2400;
		matrizLucro[7][0] = 8;
		matrizLucro[7][1] = 2300;
		matrizLucro[8][0] = 9;
		matrizLucro[8][1] = 2600;
		matrizLucro[9][0] = 10;
		matrizLucro[9][1] = 2800;
		matrizLucro[10][0] = 11;
		matrizLucro[10][1] = 3000;
		matrizLucro[11][0] = 12;
		matrizLucro[11][1] = 3200;

		for (int i = 0; i < matrizLucro.length; i++) {
			System.out.println("No mês " + matrizLucro[i][0] + " a loja teve " + matrizLucro[i][1] + " de lucro");
		}
	}
}