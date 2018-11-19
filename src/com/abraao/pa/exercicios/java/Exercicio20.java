package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		// Faça um programa que entre com um número no formato CDU e exiba na tela
		// invertido: UDC. Exiba na tela das duas maneiras em
		// variáveis individuais
		
		// !> Questão não finalizadas

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número no Formato CDU");

		int x = sc.nextInt();
		int y = x / 100;
		int c = x % 100 / 10;
		int f = x % 10;
		
		int n = f * 100 + c * 10 + y;

		System.out.println(n);

	}

}
