package Niz;

import java.util.Scanner;

public class TestNiz {

	public static void main(String[] args) {

		Niz pozovi = new Niz();
		Scanner unos = new Scanner(System.in);

		System.out.println("Unesite neki niz od 8 clanova: ");
		int[] niz = new int[8];

		for (int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextInt();
		}

		pozovi.min(niz);
		pozovi.max(niz);
		pozovi.zbirNiza(niz);
		pozovi.prosjekBrojeva(niz);
		pozovi.sortiraniNiz(niz);

		unos.close();

	}

}
