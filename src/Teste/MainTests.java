package Teste;

import java.util.Random;

import Filas.FilaInt;

public class MainTests {

	public static void main(String[] args) {

		Random R = new Random();
		FilaInt fila = new FilaInt();

		fila.init();
		fila.enqueue(R.nextInt(51));
		fila.enqueue(R.nextInt(51));
		fila.enqueue(R.nextInt(51));
		fila.enqueue(R.nextInt(51));

		if (fila.isEmpty())
			System.out.println("Fila Vazia");
		else
			System.out.println("Valor Retirado: " + fila.dequeue());

		if (fila.isEmpty())
			System.out.println("Fila Vazia");
		else
			System.out.println("Valor Retirado: " + fila.dequeue());

	}

}
