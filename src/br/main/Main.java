package br.main;

import java.util.Scanner;
import br.calc.Graphic;
import static br.calc.Calc.sum;

public class Main {
	public static void main(String... args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("Quantos números você deseja somar? ");
		Integer numTot = scr.nextInt();

		Double[] listNum = new Double[numTot];
		int count = 0;
		int pos = 0;

		do {
			pos++;
			System.out.println("Digite o número de posição " + pos + ": ");
			listNum[count] = scr.nextDouble();
			count++;
		} while (count < numTot);

		scr.close();

		Double res = sum(listNum);
		System.out.printf("Valor da Soma = %f%n", res);

		Double resSqrt = new Graphic().square(res);
		System.out.println("Valor Quadrado = " + resSqrt);

		Double resCube = new Graphic().cube(res);
		System.out.println("Valor Cúbico = " + resCube);
	}
}
