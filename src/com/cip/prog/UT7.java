package com.cip.prog;

import java.util.*;

public class UT7 {

	public static void main(String[] args) {

		int[] numeros = new int[20];
		for (int i = 0; i < numeros.length; i++)
			numeros[i] = (int) (Math.random() * 10) + 1;

		int opcion = 0;
		int suma = 0;

		Scanner teclado = new Scanner(System.in);

		do {

			System.out.println("Menu");
			System.out.println("1.mayor ");
			System.out.println("2.menor  ");
			System.out.println("3.media ");
			System.out.println("4.todos ");
			System.out.println("0.Salir");
			System.out.println("Introduzca una opción");

		opcion = teclado.nextInt();

	
		int mayor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (mayor < numeros[i]) {
				mayor = numeros[i];
			}
		}
		// System.out.println(mayor);
		int menor = numeros[0];
		for (int i = 1; i < numeros.length; i++) {
			if (menor > numeros[i]) {
				menor = numeros[i];
			}
		}
		// System.out.println(menor);
		int media = numeros[0];
		for (int i = 1; i < numeros.length; i++) {

			suma += numeros[i];

			media = (suma / numeros.length);
			// System.out.println(media);
		
		}
		
            public static void numeros() { 
		    
			for (int i = 1 ; i < numeros.length; i++) {
				
			System.out.print(" " + numeros[i]);
				
				
			}

		

			

			switch (opcion) {

			case 1:
				System.out.println(mayor);
				break;
			case 2:
				System.out.println(menor);
				break;
			case 3:
				System.out.println(media);
				break;
			case 4:
				System.out.println(todos);
				break;
			case 0:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Introduzca una opcion correcta, elija entre los numeros 0 y el 4 ");
				break;

			}while (opcion!=0);
			
			teclado.close();
	}
}
		

		

	


