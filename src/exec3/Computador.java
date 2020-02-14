package exec3;

/**
 * classe crianda para armazenar a class Computador
 * @author csleite
 * @since 11/02/2020
 */

public class Computador extends Produto {
	String processador = " i7 6000";
	String memoria = " 16 ram ";
	String tela = " AOC 29' ";
	String hd = " 1 tera ";
	String placaVideo = "NVidea 2080TI 8g ";
	
	public void exibirProduto(){
		System.out.println(processador);
		System.out.println(memoria);
		System.out.println(tela);
		System.out.println(hd);
		System.out.println(placaVideo);
		exibirTudo();
	}

}
