package exec10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Teste03 {

	public static void main(String[] args) {
		try {
			File arquivo = new File("saida.txt");
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			PrintStream gravador = new PrintStream(arquivoOutput);
			gravador.println("Claudio");
			gravador.println("Claudio");
			gravador.println("Claudio");
			gravador.println("Claudio");
			gravador.println("Claudio");
			gravador.close();
			arquivoOutput.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
