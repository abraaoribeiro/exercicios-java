package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// Faça um programa que entre com um número e exiba na tela o log desse número
		// na base 10.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número:");
		double x = sc.nextDouble();
		double log = Math.log10(x);

		System.out.println("O log do número digitado é :");
		System.out.println(log);

	}

}
