package com.abraao.pa.exercicios.java;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		// Faça um programa que entre com a base e altura de um retângulo e exiba na
		// tela: perímetro, área e a diagonal.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Digite a Base Altura de um retângulo ");
		
		int b = sc.nextInt();
		int h = sc.nextInt();
		int area = b*h; 
		int perimetro =  2*(b+h);
		//double diagonal = Math.pow(b, 2) + Math.pow(h, 2);
		
		System.out.println("Área : " + area);
		System.out.println("Perímetro: " + perimetro);
		//System.out.println("Diagonal: " +  diagonal);
		

	}

}
