package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		// Faça um programa que leia dois números inteiros e exiba na tela seu produto.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número");
		double x = sc.nextDouble();
		
		System.out.println("Digite outro número");
		double y = sc.nextDouble();
		
		double produto = x * y;
		System.out.println("O Produto dos números é: \n" +produto);
		
		

	}

}
