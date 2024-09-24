package listas;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Implementando uma lista
		
		ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println(frutas);
        
        // Nesse exemplo, mostramos como criar uma lista de frutas e adicionar elementos a ela.
        
        // Lista de números
        //Nesse exemplo, vamos manipular uma lista, adicionando e removendo elementos.
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        // Removendo um elemento
        numeros.remove(1);

        System.out.println(numeros);  // Saída: [10, 30]
        
        // Aqui, mostra-se um exemplo de quando usar LinkedList para manipulação eficiente em listas onde inserções no início ou fim são frequentes.
        
        ArrayList<String> tarefas = new ArrayList<>();
        tarefas.add("Estudar Java");
        tarefas.add("Praticar exercícios");
        tarefas.add("Revisar conteúdo");

        // Adicionando uma tarefa no início
        tarefas.addFirst("Tomar café");

        System.out.println(tarefas);
        
        
	}

}
