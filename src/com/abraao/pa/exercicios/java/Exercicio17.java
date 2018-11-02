package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {

		// Faça um programa que entre com o número e a base em que se deseja calcular
		// o log e o exiba na tela.

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		double x = sc.nextDouble();

		System.out.println("Digite o número da base:");
		double base = sc.nextDouble();

		double log = Math.log(x) / Math.log(base);

		System.out.println("Log de " + x + " com base de " + base + " é " + log);

	}

}
