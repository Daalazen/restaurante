package restaurante;

import java.util.Scanner;

public class Restaurante {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String[] itens = { "Vegetariano", "Peixe", "Frango", "Carne", "Abacaxi", "Sorvete Diet", "Mousse Diet",
				"Mousse Chocolate", "Chá", "Suco de Laranja", "Suco de Melão", "Refrigerante Diet" };
		double totalPreco = 0;
		double[] totalPrecovet = new double[12];
		int[] qtd = new int[12];
		int a = 1;
		int kcal = 0;

		System.out.println("SEU NOME: ");
		String nome = ler.next();
		while (a == 1) {
			System.out.print("|   Código   |");
			System.out.println("   Cardápio   |");
			System.out.println("");
			System.out.printf(
					"|      1     |   Pratos     |%n|      2     |   Sobremesas |%n|      3     |   Bebidas    |%n%n");
			System.out.println("DIGITE O CÓDIGO DOS ITENS QUE DESEJA VER");
			System.out.println("FINALIZAR COMPRA [0]");

			int le = ler.nextInt();
			if (le == 0) {
				a = 0;
				break;
			}

			int i = 1;
			switch (le) {

			// PRATOS

			case 1:

				while (i == 1) {
					System.out.print("|   Código   |");
					System.out.println("   Pratos   |");
					System.out.println("");
					System.out.printf(
							"|      1     |   Vegetariano%n		  180 Kcal%n		  R$ 18,50     |%n%n|      2     |    Peixe%n		  230 Kcal%n		  R$ 22,30       |%n%n|      3     |   Frango%n		  250 Kcal%n		  R$ 27,50     |%n%n|      4     |   Carne%n		  350 Kcal%n		  R$ 20,50     |%n%n");
					System.out.println("DIGITE O CÓDIGO DOS ITENS QUE DESEJA COMPRAR");
					System.out.println("SAIR [0]");
					le = ler.nextInt();
					if (le == 0) {
						i = 0;
						break;
					} else {
					}

					switch (le) {
					case 1:
						totalPreco += 18.50;
						kcal += 180;
						qtd[0] += 1;
						totalPrecovet[0] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[0], qtd[0], totalPrecovet[0]);

						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}

						break;
					case 2:
						totalPreco += 22.30;
						kcal += 230;
						qtd[1] += 1;
						totalPrecovet[1] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[1], qtd[1], totalPrecovet[1]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}
						break;
					case 3:
						totalPreco += 27.50;
						kcal += 250;
						qtd[2] += 1;
						totalPrecovet[2] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[2], qtd[2], totalPrecovet[2]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}

						break;
					case 4:
						totalPreco += 20.50;
						kcal += 350;
						qtd[3] += 1;
						totalPrecovet[3] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[3], qtd[3], totalPrecovet[3]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}
						break;
					}

				}

				// SOBREMESAS
			case 2:

				while (i == 1) {
					System.out.print("|   Código   |");
					System.out.println("   Sobremesas   |");
					System.out.println("");
					System.out.printf(
							"|      1     |   Abacaxi%n		  75 Kcal%n		  R$ 11.50    |%n%n|      2     |    Sorvete Diet%n		  110 Kcal%n		  R$ 13.50      |%n%n|      3     |   Mouse Diet%n		  170 Kcal%n		  R$ 13.00     |%n%n|      4     |   Mousse Chocolate%n		  200 Kcal%n		  R$ 12.50     |%n%n");
					System.out.println("DIGITE O CÓDIGO DOS ITENS QUE DESEJA COMPRAR");
					System.out.println("SAIR [0]");
					le = ler.nextInt();
					if (le == 0) {
						i = 0;
						break;
					}

					switch (le) {
					case 1:
						totalPreco += 11.50;
						kcal += 75;
						qtd[4] += 1;
						totalPrecovet[4] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[4], qtd[4], totalPrecovet[4]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}

						break;
					case 2:
						totalPreco += 13.50;
						kcal += 110;
						qtd[5] += 1;
						totalPrecovet[5] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[5], qtd[5], totalPrecovet[5]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}
						break;
					case 3:
						totalPreco += 13.00;
						kcal += 170;
						qtd[6] += 1;
						totalPrecovet[6] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[6], qtd[6], totalPrecovet[6]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}

						break;
					case 4:
						totalPreco += 12.50;
						kcal += 200;
						qtd[7] += 1;
						totalPrecovet[7] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[7], qtd[7], totalPrecovet[7]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}
						break;
					}

				}

				break;
			// BEBIDAS
			case 3:

				while (i == 1) {
					System.out.print("|   Código   |");
					System.out.println("   Bebidas   |");
					System.out.println("");
					System.out.printf(
							"|      1     |   Chá%n		  20 Kcal%n		  R$ 6.00    |%n%n|      2     |    Suco de Laranja%n		  70 Kcal%n		  R$ 12.50      |%n%n|      3     |   Suco de Melão%n		  100 Kcal%n		  R$ 13.00     |%n%n|      4     |   Refrigerante Diet%n		  65 Kcal%n		  R$ 9.00     |%n%n");
					System.out.println("DIGITE O CÓDIGO DOS ITENS QUE DESEJA COMPRAR");
					System.out.println("SAIR [0]");
					le = ler.nextInt();
					if (le == 0) {
						i = 0;
						break;
					}

					switch (le) {
					case 1:
						totalPreco += 6.00;
						kcal += 20;
						qtd[8] += 1;
						totalPrecovet[8] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[8], qtd[8], totalPrecovet[8]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}

						break;
					case 2:
						totalPreco += 12.50;
						kcal += 70;
						qtd[9] += 1;
						totalPrecovet[9] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[9], qtd[9], totalPrecovet[9]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}
						break;
					case 3:
						totalPreco += 13.00;
						kcal += 100;
						qtd[10] += 1;
						totalPrecovet[10] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[10], qtd[10], totalPrecovet[10]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}

						break;
					case 4:
						totalPreco += 9.00;
						kcal += 65;
						qtd[11] += 1;
						totalPrecovet[11] = 18.50;

						System.out.println("Cliente: " + nome);
						System.out.println();
						System.out.printf("Produto               Qtd           Valor%n");
						System.out.printf("-------               ---           -----%n");
						System.out.printf("%s           %d              %.2f%n", itens[11], qtd[11], totalPrecovet[11]);
						System.out.println("DESEJA CONTINUAR COMPRANDO? [1] SIM | [2] NÃO");
						le = ler.nextInt();

						if (le == 1) {
							i = 1;
						} else {
							i = 0;
						}
						break;
					}

				}

				break;
			// CASO NADA
			default:
			}
		}

		System.out.printf("Valor total a pagar R$           %.2f%n", totalPreco);
		System.out.printf("Qtd total de calorias R$           %d", kcal);

		ler.close();
	}

}
