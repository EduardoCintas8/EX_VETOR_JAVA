package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoa;

public class Programn {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double maior = 0.0;
		double menor = 0.0;
		double mediaM = 0.0;
		int sun = 0;

		System.out.print("Quantas pessoas serao digitadas? :");
		int n = sc.nextInt();
		System.out.println();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char genero = sc.next().toUpperCase().charAt(0);

			vect[i] = new Pessoa(altura, genero);

		}

		menor = vect[0].getAltura();

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAltura() < menor) {
				menor = vect[i].getAltura();
			}

			if (vect[i].getAltura() > maior) {
				maior = vect[i].getAltura();
			}
		}

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getGenero() != 'M') {
				mediaM += vect[i].getAltura();
				sun ++;
			}
		}
		
			System.out.printf("Menor altura: %.2f%n", menor);
			System.out.printf("Maior altura: %.2f%n", maior);
			System.out.printf("Media das alturas das mulheres: %.2f%n", (mediaM / sun));
			System.out.println("Numero de homens: " + (vect.length - sun));
		

		sc.close();
	}

}
