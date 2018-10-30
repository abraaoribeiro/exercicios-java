package com.abraao.pa.exercicios.java;

import javax.swing.JOptionPane;

public class ExercicioJava {

	public static void main(String[] args) {

		// 1) Faça um Programa que exiba na tela "É preciso fazer todos os algoritmos
		// para
		// aprender a programar"

		//JOptionPane.showMessageDialog(null, "É preciso fazer todos os algoritmos para aprender a programar");

		// 2) Faça um programa que exiba na Tela o seu nome
		
		//JOptionPane.showMessageDialog(null, "Abraao Souza Ribeiro");

		// 3) Faça um programa que exiba na tela o produto entre 28 e 43.
		int a = 28;
		int b = 43;
		int produto;

		produto = a * b;

		System.out.println(produto);

		// 4) Faça um programa que exiba na tela a média aritmética entre os números 8,
		// 9 e 7.
		int c = 8;
		int d = 9;
		int e = 7;
		int media;

		media = (c + d + e) / 2;

		System.out.println("========================");
		System.out.println("Média" + media);

		// 5) Faça um programa que leia um número inteiro e exiba na tela.

		int x = 5;
		System.out.println("========================");
		System.out.println(x);
		
		// 6) Faça um programa que leia dois números inteiros e os exiba na tela
		
		int f = 5;
		int g = 9;
		System.out.println("========================");
		System.out.println("Primeiro:" + f + "Segundo:" + g);		

		// 7) Faça um programa que leia um número inteiro e exiba na tela seu sucessor e seu antecessor.
		
		int h = 4;
		int sucessor;
		int antercessor;
		
		antercessor = h - 1;
		sucessor = h + 1 ;
		System.out.println("========================");
		System.out.println("antercessor: "+ antercessor+ "\nsucessor: "+ sucessor);
		
		// 8) Faça um programa que leia nome, endereço e telefone e exiba na tela.
		
		String nome = null;
		String endereco= null;
		int tel = 0;
		
		System.out.println("Nome:" + nome);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + tel);
		

	}

}
