package br.edu.IFCE;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double catAdj;
		System.out.printf("Digite o valor do cateto adjacente: %n");
		catAdj = sc.nextDouble();
		
		Scanner sc1 = new Scanner(System.in);
		double catOp;
		System.out.printf("Digite o valor do cateto oposto: %n");
		catOp = sc1.nextDouble();
		
		double hip = Math.sqrt(Math.pow(catAdj, 2) + Math.pow(catOp, 2));
		System.out.printf("O valor da Hipotenusa é de: %.2f %n", hip);

	}

}
