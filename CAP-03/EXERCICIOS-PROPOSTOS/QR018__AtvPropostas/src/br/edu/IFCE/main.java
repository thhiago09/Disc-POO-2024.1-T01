package br.edu.IFCE;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double Celsius; 
		System.out.printf("Digite a temperatura em Celsius: %n");
		Celsius = sc.nextDouble();
		
		double FH = Celsius * 1.8 + 32;
		System.out.printf("Sua temperatura em Fahrenheit é de: %.2f ", FH);
		
		
	}

}
