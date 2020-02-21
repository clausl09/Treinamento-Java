package exec11;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class TesteGui08 {
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel jtfSenha;
	private JPasswordField jpwSenha;
	
	public void iniciarGui() {
		
		//criar instancias
		janela = new JFrame("Exemplo de campo de senha");
		painelDaJanela = (JPanel) janela.getContentPane();
		jtfSenha = new JLabel();
		jpwSenha = new JPasswordField();
		
		// CONFI  A LABEL SENHA
		jtfSenha.setText("Senha");
		jtfSenha.setBounds(10, 40, 40, 20);
		
		//config o campo senha
		jpwSenha.setBounds(60, 40, 100, 20);
		
		//confg painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(jtfSenha);
		painelDaJanela.add(jpwSenha);
		
		//config a tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);
					
	}
	public static void main(String[] args) {
		new TesteGui08().iniciarGui();
	}
}
