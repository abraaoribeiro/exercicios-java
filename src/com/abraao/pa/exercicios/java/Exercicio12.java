package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		// Faça um programa que entre com dois números reais e exiba na tela
		// a sua média aritmética, com a mensagem "Média:" antes do
		// resultado.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número real")	;
		double x = sc.nextDouble();
		
		System.out.println("Digite outro número real")	;
		double y = sc.nextDouble();
		
		double media = (x+y)/2;
		
		System.out.println("Média: \n" +media);

	}

}
