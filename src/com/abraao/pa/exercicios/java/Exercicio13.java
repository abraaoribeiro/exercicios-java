package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	// Faça um programa que entre com dois números inteiros e 
	// exiba na tela a seguintes saída: dividendo, divisor, quociente e resto.

		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite um número");
	int x = sc.nextInt();
	
	System.out.println("Digite outro número");
	int y = sc.nextInt();
	
	int quociente = x / y ;
	int resto = x % y;
	
	System.out.println("Dividido:" + x);
	
	System.out.println("Divisor:" + y);
	
	System.out.println("Quociente:" + quociente);
	
	System.out.println("Resto:" + resto);
	
	
	
	}


}
