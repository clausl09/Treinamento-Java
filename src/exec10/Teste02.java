package exec10;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Teste02 {

	public static void main(String[] args) {
		PrintStream gravador;
		try {
			gravador = new PrintStream("saida.txt");
			gravador.println("Claudio de Sousa Leite");
			gravador.println("Claudio");
			gravador.println("Claudio");
			gravador.println("Claudio");
			gravador.println("Claudio");
			gravador.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
