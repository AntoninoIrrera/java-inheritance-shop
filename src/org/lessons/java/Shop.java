package org.lessons.java;

public class Shop {
	public static void main(String[] args) {
		
		
		Prodotto p = new Prodotto(33354, "prova","samsung", 100, 22);
		Smarphone s = new Smarphone(33354, "prova","samsung", 100, 22,111,32);
		Televisore t = new Televisore(33354, "prova","samsung", 100, 22, 50, true);
		Cuffia c = new Cuffia(33354, "prova","samsung", 100, 22, "nero", "cablate");
		
		System.out.println(p);
		System.out.println(s);
		System.out.println(t);
		System.out.println(c);
		
	}
}
