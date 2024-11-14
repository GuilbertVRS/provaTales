package poo2;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Double n1 = 0.0;
		Double n2 = 0.0;
		Double Total = 0.0;
		String operacao;
		Scanner leia = new Scanner(System.in);
		System.out.println("O peração Matematica: ");
		System.out.println("Escola a Operação: Vezes, Menos, Mais, Divisão, Divisão% ");
		operacao = leia.next();

		if (operacao.equalsIgnoreCase("Vezes")) {
			System.out.println("Digite o 1 numero: ");
			n1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			n2 = leia.nextDouble();
			Total = n1 * n2;
			System.out.println("O rezultado e: " + Total);

		} else if (operacao.equalsIgnoreCase("Mais")) {
			System.out.println("Digite o 1 numero: ");
			n1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			n2 = leia.nextDouble();
			Total = n1 + n2;
			System.out.println("O rezultado e: " + Total);
		} else if (operacao.equalsIgnoreCase("Menos")) {
			System.out.println("Digite o 1 numero: ");
			n1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			n2 = leia.nextDouble();
			Total = n1 - n2;
			System.out.println("O rezultado e: " + Total);
		} else if (operacao.equalsIgnoreCase("Divisão") ) {
			System.out.println("Digite o 1 numero: ");
			n1 = leia.nextDouble();
			System.out.println("Digite o 2 numero: ");
			n2 = leia.nextDouble();
			Total = n1 / n2;
			System.out.println("O rezultado e: " + Total);
		} else if (operacao.equalsIgnoreCase("Divisão%") ) {
			System.out.println("Digite o Valor da Porcentagem: ");
			n2 = leia.nextDouble();
			System.out.println("Digite o Valor a Ser Porcentado: ");
			n1 = leia.nextDouble();
			Total = n1 * (n2/ 100.0);
			System.out.println("O rezultado e: " + Total);
		} else {
			System.out.println("Operação Invalida!");
		}

	}

}