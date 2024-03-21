package br.edu.IFCE;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1;
		System.out.printf("Digite seu primeiro número: %n");
		num1 = sc.nextDouble();
		
		Scanner sc1 = new Scanner(System.in);
		double num2;
		System.out.printf("Digite seu segundo número: %n");
		num2 = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		double num3;
		System.out.printf("Digite seu terceiro número: %n");
		num3 = sc2.nextDouble();
		
		double mult = num1 * num2 * num3;
		System.out.printf("O produto entre os números é de: %.2f %n", mult);
		
		
	}

}
