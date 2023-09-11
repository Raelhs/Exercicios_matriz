//Crie essa matriz:

//2104	3	399900
//1600	3	329900
//2400	3	369000
//1416	2	232000
//3000	4	539900
//1985	4	299900
//1534	3	314900
//1427	3	199000
//1380	3	212000
//1494	3	242500
//1940	4	240000
//2000	3	347000
//1890	3	330000
//4478	5	699900
//1268	3	259900
//A primeira coluna é o tamanho da casa
//A segunda coluna é a quantidade de quartos
//A terceira coluna é o preço

//Determinar:
//a) Qual é a média dos preços das casas?
//b) Quanto custa a menor casa? E quantos quartos tem a casa mais cara?
//c) Qual a diferença de tamanho da casa com o maior número de quartos
//   para a casa com o menor número de quartos?
//d) Qual a média do tamanho das casas que custam mais de 300.000 mil? 

package exercicios_matriz;

public class Exer5 {

	
	    public static void main(String[] args) {
	        int[][] dadosCasas = {
	            {2104, 3, 399900},
	            {1600, 3, 329900},
	            {2400, 3, 369000},
	            {1416, 2, 232000},
	            {3000, 4, 539900},
	            {1985, 4, 299900},
	            {1534, 3, 314900},
	            {1427, 3, 199000},
	            {1380, 3, 212000},
	            {1494, 3, 242500},
	            {1940, 4, 240000},
	            {2000, 3, 347000},
	            {1890, 3, 330000},
	            {4478, 5, 699900},
	            {1268, 3, 259900}
	        };

	       
	        int somaPrecos = 0;
	        for (int i = 0; i < dadosCasas.length; i++) {
	            somaPrecos += dadosCasas[i][2];
	        }
	        double mediaPrecos = (double) somaPrecos / dadosCasas.length;
	        System.out.printf("a) Média dos preços das casas: R$%.2f %n" , mediaPrecos);

	     
	        int menorPreco = Integer.MAX_VALUE;
	        int maisCara = Integer.MIN_VALUE;
	        int quartosCasaMaisCara = 0;
	        for (int i = 0; i < dadosCasas.length; i++) {
	            if (dadosCasas[i][2] < menorPreco) {
	                menorPreco = dadosCasas[i][2];
	            }
	            if (dadosCasas[i][2] > maisCara) {
	                maisCara = dadosCasas[i][2];
	                quartosCasaMaisCara = dadosCasas[i][1];
	            }
	        }
	        System.out.println("b) Menor preço de uma casa: R$" + menorPreco);
	        System.out.println("   Quartos na casa mais cara: " + quartosCasaMaisCara);

	      
	        int menorQuartos = Integer.MAX_VALUE;
	        int maiorQuartos = Integer.MIN_VALUE;
			for (int i = 0; i < dadosCasas.length; i++) {
	            if (dadosCasas[i][1] > maiorQuartos ) {
	                maiorQuartos = dadosCasas[i][1];
	            }
	            if (dadosCasas[i][1] < menorQuartos) {
	                menorQuartos = dadosCasas[i][1];
	            }
	        }
	        int diferencaQuartos = maiorQuartos - menorQuartos;
	        System.out.println("c) Diferença de tamanho entre a casa com mais quartos e a com menos quartos: " + diferencaQuartos);

	      
	        int somaTamanhoCasasAcima300k = 0;
	        int contadorCasasAcima300k = 0;
	        for (int i = 0; i < dadosCasas.length; i++) {
	            if (dadosCasas[i][2] > 300000) {
	                somaTamanhoCasasAcima300k += dadosCasas[i][0];
	                contadorCasasAcima300k++;
	            }
	        }
	        double mediaTamanhoCasasAcima300k = (double) somaTamanhoCasasAcima300k / contadorCasasAcima300k;
	        System.out.println("d) Média do tamanho das casas que custam mais de 300.000 mil: " + mediaTamanhoCasasAcima300k);
	    }
	}

