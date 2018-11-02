package com.abraao.pa.exercicios.java;

import java.util.Scanner;

/**
 * @author abraao
 *
 */
public class Exercicio11 {

	public static void main(String[] args) {
		// Faça um programa que leia um número real e exiba na tela a sua terça parte.

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número real");
		double x = sc.nextDouble();

		double real = x / 3;
		System.out.println("A sua terça parte é \n" + real);

	}

}
