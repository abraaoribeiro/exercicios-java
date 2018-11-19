package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		// Faça um programa que entre com o saldo de uma aplicação e exiba na tela um
		// novo saldo, considerando um reajuste de 1%.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		
		Double saldo = sc.nextDouble();
		
		Double reajuste = saldo + (saldo*0.01);
		
		System.out.println(reajuste);
		
		
		
		
	}

}
