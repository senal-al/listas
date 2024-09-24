package listas;

import java.util.ArrayList;

public class TrabalhandoEManipulandoListas {

	public static void main(String[] args) {
		ArrayList<Integer> conjuntoDeNumeros = new ArrayList<>();

		// Adicionando elementos
		conjuntoDeNumeros.add(10);
		conjuntoDeNumeros.add(20);
		conjuntoDeNumeros.add(30);

		// Iterando sobre a lista
		for (int numero : conjuntoDeNumeros) {
			System.out.println(numero);
		}

		// Buscando elemento
		if (conjuntoDeNumeros.contains(20)) {
			System.out.println("O número 20 está na lista.");
		}

		// Removendo elemento por valor
		conjuntoDeNumeros.remove(Integer.valueOf(20));

		System.out.println(conjuntoDeNumeros);

	}

}
