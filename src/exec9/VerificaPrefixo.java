package exec9;

public class VerificaPrefixo {

	public static void main(String[] args) {
		String str = "11 971155819";
		if(str.startsWith(str, 11)) {
			System.out.println("Eu sou de São Paulo");
		}else {
			System.out.println("Não sou de São Paulo");
		}

	}

}
