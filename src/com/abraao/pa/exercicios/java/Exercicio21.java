package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {

		// Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo,
		// faça um programa que receba o valor de um salário
		// mínimo e a quantidade de quilowatts gasta por uma residência e exiba na tela:
		// O valor em reais de cada quilowatt, o valor em reais
		// a ser pago e o novo valor a ser pago por essa residência com um desconto de
		// 10%.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário atual");

		int salario = sc.nextInt();

		//double quilowatts = (salario / 100) * 1;
		
		double quilowatts = (salario / 7) * 1;
		double desconto  = salario*(1 - 0.1) ;
		
		
		System.out.println(" Valor em reais de cada quilowatts é R$: " + quilowatts);
		System.out.println("Valor total a ser pago com desconto é R$: " + desconto);
		
	}

}
