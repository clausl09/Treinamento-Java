package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;

//declarar as variaveis de referencia 

public class TesteGui1 {
	
	private static JFrame janela;
	private static JButton botao;
	
	public static void main(String[] args) {
		//instanciando a janela
		janela = new JFrame("Tela");
		//instanciando o botao
		botao = new JButton("Clique aqui!!!");
		//adc o botao no painel da janela
		janela.getContentPane().add(botao);
		//configurar a janela
		janela.setSize(300, 300);
		//configurar a visualização da tabela
		janela.setVisible(true);
		janela.getContentPane().setLayout(null);
		
	}
}
