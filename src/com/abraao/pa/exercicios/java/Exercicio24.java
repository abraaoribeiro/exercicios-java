package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		// Faça um programa que entre com um raio de um círculo e exiba na tela: perímetro e área.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o raio de um circulo");
		int r = sc.nextInt();
		double area = 3.14 * Math.pow(r, 2)  ;
		double p = 3.14 * 2 * r;
		
		System.out.println("Perimetro "+p);
		System.out.println("Área " + area);
	}

}
