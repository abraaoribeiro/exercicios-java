package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// Faça um programa que entre com um angulo em graus e exiba na tela:
		// seno, coseno, tangente, secante, cossecante e cotangente do mesmo.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um ângulo");
		double angulo = sc.nextDouble();

		double b = Math.toRadians(angulo);
		double seno = Math.sin(b);
		double coseno = Math.cos(b);
		double tangente = Math.tan(b);
		double secante = 1 / Math.cos(angulo);
		double cossecante = 1 / Math.sin(angulo);
		double contagente = Math.cos(angulo) / Math.sin(angulo);

		System.out.printf("Seno é  %.3f %n", (seno));
		System.out.printf("Coseno é  %.3f %n", (coseno));
		System.out.printf("Tangente é  %.3f %n", (tangente));
		System.out.printf("Secante é  %.3f %n", (secante));
		System.out.printf("Cossecante é  %.3f %n", (cossecante));
		System.out.printf("Cotagente é  %.3f %n", (contagente));

	}

}
