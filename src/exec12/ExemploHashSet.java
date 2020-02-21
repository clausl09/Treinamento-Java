package exec12;

import java.util.HashSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		HashSet<String> listaString = new HashSet<String>();
		listaString.add("A era do gelo");
		listaString.add("Madagascar");
		listaString.add("Fuga das galinhas");
		
		System.out.println(listaString);

		HashSet<Integer> listaInteger = new HashSet<Integer>();
		listaInteger.add(10);
		listaInteger.add(1);
		listaInteger.add(1);
		listaInteger.add(2);
		listaInteger.add(3);
		
		System.out.println(listaInteger);
		
	}

}
