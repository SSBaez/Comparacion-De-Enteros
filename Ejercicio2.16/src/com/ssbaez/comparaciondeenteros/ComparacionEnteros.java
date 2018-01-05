package com.ssbaez.comparaciondeenteros;

import java.util.Scanner;

public class ComparacionEnteros {
	
	public static void main (String[] args){
		
		int numero1,
			numero2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que compara dos números");
		System.out.print("Ingrese el primer número: ");
		numero1 = input.nextInt();
		System.out.print("Ingrese el segundo número: ");
		numero2 = input.nextInt();
		
		if(numero1 > numero2){
			System.out.printf("El numero %d es más grande", numero1);}
		
		else if(numero2 > numero1){
			System.out.printf("El número %d es más grande", numero2);}
		
		else{
			System.out.println("Estos números son iguales");
		}
		
		
		
		
	}

}
