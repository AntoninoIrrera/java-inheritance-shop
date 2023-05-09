package org.lessons.java;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Catalogo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int userInput = -1;
		
		Random rnd = new Random();
		
		int codice = rnd.nextInt(1000);
		
		Prodotto[] catalogo = new Prodotto[100];
		int contatore = 0;
		
		while(userInput != 3) {
			
			System.out.println("cosa desideri inserire all'interno del catalogo \n 0-smartphone \n 1-televisore \n 2-cuffie \n 3-esci");
			userInput = sc.nextInt();
		
			
			if(userInput == 0) {
				
				System.out.println("inserisci il nome del prodotto");
				String userNome = sc.nextLine();
				System.out.println("inserisci la marca");
				String userMarca = sc.nextLine();
				System.out.println("inserisci il prezzo");
				float userPrezzo = sc.nextFloat();
				System.out.println("inserisci la memoria");
				int userMemoria = sc.nextInt();
				
				
				
				catalogo[contatore] = new Smarphone(codice,userNome,userMarca,userPrezzo,22,codice,userMemoria);
				
				
			}else if (userInput == 1) {
				
				System.out.println("inserisci il nome del prodotto");
				String userNome = sc.nextLine();
				System.out.println("inserisci la marca");
				String userMarca = sc.nextLine();
				System.out.println("inserisci il prezzo");
				int userPrezzo = sc.nextInt();
				System.out.println("inserisci le dimensioni");
				int userDimensioni = sc.nextInt();
				System.out.println("inserisci se smart o no \n 0-smart \n 1-non smart");
				int userSmart = sc.nextInt();
				
				boolean tSmart = false;
				
				if(userSmart == 0) {
					
					tSmart = true;
					
				}else if(userSmart == 1) {
					
					tSmart = false;
					
				}
				
				
				catalogo[contatore] = new Televisore(codice,userNome,userMarca,userPrezzo,22,userDimensioni,tSmart);
				
				
			}else if (userInput == 2) {
				
				System.out.println("inserisci il nome del prodotto");
				String userNome = sc.nextLine();
				System.out.println("inserisci la marca");
				String userMarca = sc.nextLine();
				System.out.println("inserisci il prezzo");
				int userPrezzo = sc.nextInt();
				System.out.println("inserisci il colore");
				String userColore = sc.nextLine();
				System.out.println("inserisci se cablate o wirless");
				String userWirless = sc.nextLine();
				
				
				catalogo[contatore] = new Cuffia(codice,userNome,userMarca,userPrezzo,22,userColore,userWirless);
				
				
			}
		
			contatore ++;
		}
		
		
		System.out.println(Arrays.asList(catalogo));
		
		sc.close();
		
		
		
	}
}
