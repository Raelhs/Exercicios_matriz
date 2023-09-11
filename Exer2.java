//Calcule o determinante da matriz abaixo:
//4  12
//2  -3

package exercicios_matriz;

public class Exer2 {

	public static void main(String[] args) {

		int a = 4;
		int b = 12;
		int c = 2;
		int d = -3;

		int determinante = (a * d) - (b * c);

		System.out.println("O determinante da matriz é: " + determinante);
	}
}