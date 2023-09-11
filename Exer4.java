//Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes.
//Trinta deles foram ouvidos e para cada um perguntou-se o sexo (1=feminino 2=masculino), 
//uma nota para o cinema (zero até dez, valor inteiro) e a idade.

//Baseado nisto faça um programa que informe:

//- qual a nota média recebida pelo cinema;
//- qual a nota média atribuída pelos homens;
//- qual a nota atribuída pela mulher mais jovem;
//- quantas das mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.

//Não utilize vetores!!

package exercicios_matriz;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int totalClientes = 3;
		int[][] dadosClientes = new int[totalClientes][3];
		for (int i = 0; i < totalClientes; i++) {
			System.out.println("Cliente " + (i + 1));
			System.out.print("Sexo (1 = feminino, 2 = masculino): ");
			dadosClientes[i][0] = scanner.nextInt();
			System.out.print("Nota para o cinema (de 0 a 10): ");
			dadosClientes[i][1] = scanner.nextInt();
			System.out.print("Idade: ");
			dadosClientes[i][2] = scanner.nextInt();
		}

		int totalHomens = 0;
		int somaNotas = 0;
		int somaNotasHomens = 0;
		int notaMulherMaisJovem = Integer.MIN_VALUE;
		int contadorMulheresMais50 = 0;

		for (int i = 0; i < totalClientes; i++) {
			somaNotas += dadosClientes[i][1];

			if (dadosClientes[i][0] == 2) {

				somaNotasHomens += dadosClientes[i][1];
				totalHomens++;
			}

			if (dadosClientes[i][0] == 1 && dadosClientes[i][2] > notaMulherMaisJovem) {

				notaMulherMaisJovem = dadosClientes[i][1];
			}

			if (dadosClientes[i][0] == 1 && dadosClientes[i][2] > 50
					&& dadosClientes[i][1] > (somaNotas / totalClientes)) {

				contadorMulheresMais50++;
			}
		}

		double notaMediaCinema = (double) somaNotas / totalClientes;
		double notaMediaHomens = (double) somaNotasHomens / totalHomens;

		System.out.printf("\nNota média recebida pelo cinema: %.2f %n" , notaMediaCinema);
		System.out.printf("Nota média atribuída pelos homens: %.2f %n" , notaMediaHomens);
		System.out.println("Nota atribuída pela mulher mais jovem: " + notaMulherMaisJovem);
		System.out.println("Mulheres com mais de 50 anos que deram nota superior à média: " + contadorMulheresMais50);
	}

	{

	}
}
