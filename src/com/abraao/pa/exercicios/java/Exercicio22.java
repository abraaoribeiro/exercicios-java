package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {

		// Faça um programa que entre com um nome e exiba na tela: nome completo,
		// primeiro caractere último caractere, do primeiro ao
		// terceiro caractere, quarto caractere, todos menos o primeiro e os dois
		// últimos.

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome");
		
		String nome = sc.next();
		
		
		System.out.println(nome);
		System.out.println(nome.charAt(0));
		System.out.println(nome.charAt(2));
		System.out.println(nome.charAt(nome.length()-1));
		System.out.println(nome.substring(0, 3));
		System.out.println(nome.charAt(3));
		System.out.println(nome.substring(1, nome.length()-2));
		
	
		
	}

}
