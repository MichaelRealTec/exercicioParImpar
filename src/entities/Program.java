package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
		 exercicio: par_impar
		*/
		int n;
		int numero;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite um numero: ");
			numero = sc.nextInt();
			if(numero == 0) {
				System.out.println("NULO");
			}
			if(numero % 2 == 0 && numero > 0) {
				System.out.println("PAR POSITIVO");
			} else if(numero % 2 == 0 && numero < 0) {
				System.out.println("PAR NEGATIVO");
			} else if(numero % 2 != 0 && numero > 0) {
				System.out.println("IMPAR POSITIVO");
			} else if(numero % 2 != 0 && numero < 0) {
				System.out.println("IMPAR NEGATIVO");
			}
		}
		
		sc.close();
	}

}
