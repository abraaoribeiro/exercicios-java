package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// Faça um programa que entre com um número e exiba na tela: número, quadrado e
		// raiz quadrada.

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número:");
		double x = sc.nextDouble();
		double quadrado = Math.pow(2, x);
		double raiz = Math.sqrt(x);

		System.out.println("O número digitado é " 
		+ x + " Quadrado é " + quadrado + " e a Raiz Quadrada é  " + raiz);

	}
}
