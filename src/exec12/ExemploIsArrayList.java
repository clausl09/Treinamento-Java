package exec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploIsArrayList {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();

		// adiciona elementos ao final da lista
		arrayList.add("Elemento nº1");
		arrayList.add("Elemento nº2");
		arrayList.add("Elemento nº3");

		System.out.println("Posição um contem: " + arrayList.get(0));
		System.out.println("Posição um contem: " + arrayList.get(1));
		System.out.println("Posição um contem: " + arrayList.get(2));

		for (String s : arrayList) {
			System.out.println(s);
		}

		// tambem podemos adicionar um elemento em uma posição qualquer
		arrayList.add(1, "Elemento nº1,5");
		System.out.println("\nApos adicionar o elemento 1,5:\n");

		for (String s : arrayList) {
			System.out.println(s);
		}

		// obter o tamanho da lista
		System.out.println("\nO tamanho da lista é: " + arrayList.size() + "\n");

		// podemos ver um determinado valor na lista
		if (arrayList.contains("Elemento nº1,5")) {
			System.out.println("Elemento 1,5 existe");
		} else {
			System.out.println("Elemento 1,5 Não existe");
		}

		int indice = arrayList.indexOf("Elemento nº1,5");
		System.out.println("\nO indece do elemento 1,5 é: " + indice);

		// remover um elemento da lista
		System.out.println("\nRemover elemento 1,5");
		arrayList.remove("Elemento nº1,5");
		System.out.println("Lista atualizada");

		for (String s : arrayList) {
			System.out.println(s);
		}

		// remover com base no indice - remover ultimo registro
		System.out.println("\nRemovendo o ultimo elemento");
		arrayList.remove(arrayList.size() - 1);
		System.out.println("Lista atualizada");

		for (String s : arrayList) {
			System.out.println(s);
		}

		// Adicionando elementos na lista
		System.out.println("\nAdicionando elementos na lista");
		arrayList.add("Elemento nº5");
		arrayList.add("Elemento nº6");
		arrayList.add("Elemento nº2");
		arrayList.add("Elemento nº0");
		arrayList.add("Elemento nº9");

		// exibir a lista atualizada
		System.out.println("\nLista com elementos adiciona");
		for (String s : arrayList) {
			System.out.println(s);
		}

		// ordenando array list
		Collections.sort(arrayList);
		System.out.println("\nLista ordenada");
		for (String s : arrayList) {
			System.out.println(s);
		}

		// criando uma lista de objetos - filme
		List<Filme> arraFilmes = new ArrayList<Filme>();

		// criando 3 filmes
		Filme filme1 = new Filme();
		filme1.setCodigo(1);
		filme1.setNome("Codigo de conduta");

		Filme filme2 = new Filme();
		filme2.setCodigo(2);
		filme2.setNome("Era do gelo");

		Filme filme3 = new Filme();
		filme3.setCodigo(3);
		filme3.setNome("Matrix");

		// comparando os filmes
		if (filme1.equals(filme2)) {
			System.out.println("Filmes Iguais\n");
		} else {
			System.out.println("Filmes Diferentes\n");
		}
		
		//adicionar na lista os filmes instanciados
		arraFilmes.add(filme1);
		arraFilmes.add(filme2);
		arraFilmes.add(filme3);
		
		//exibindo a lista de filme
		for (Filme f: arraFilmes) {
			System.out.println(f);
		}
		
//		//lista ordenada
//		System.out.println("Lista ordenada");
//		Collections.sort((List<T>) arraFilmes);
//		for (Filme f : arraFilmes) {
//			System.out.println();
//		}
		
		
		
		
		
		
	}

}
