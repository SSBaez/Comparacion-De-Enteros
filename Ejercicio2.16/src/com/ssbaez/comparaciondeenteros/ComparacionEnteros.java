package com.ssbaez.comparaciondeenteros;

import java.util.Scanner;

public class ComparacionEnteros {
	
	public static void main (String[] args){
		
		int numero1,
			numero2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que compara dos n�meros");
		System.out.print("Ingrese el primer n�mero: ");
		numero1 = input.nextInt();
		System.out.print("Ingrese el segundo n�mero: ");
		numero2 = input.nextInt();
		
		if(numero1 > numero2){
			System.out.printf("El numero %d es m�s grande", numero1);}
		
		else if(numero2 > numero1){
			System.out.printf("El n�mero %d es m�s grande", numero2);}
		
		else{
			System.out.println("Estos n�meros son iguales");
		}
		
		
		
		
	}

}
