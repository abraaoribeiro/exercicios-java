package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// Faça um programa que entre com 4 números e
		// exiba na tela a média ponderada, sabendo que seus respectivos pesos são: 1,
		// 2, 3, 4.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 4 números");

		System.out.println("Digite :");
		double x = sc.nextDouble();
		System.out.println("Digite :");
		double y = sc.nextDouble();
		System.out.println("Digite :");
		double z = sc.nextDouble();
		System.out.println("Digite :");
		double w = sc.nextDouble();

		double ponderada = ((x * 1) + (y * 2) + (z * 3) + (w * 4)) / 10;

		System.out.println(ponderada);

	}

}
