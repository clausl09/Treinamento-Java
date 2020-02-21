package exec11;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TesteGui2 {

	public static void main(String[] args) {
		// definir a tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Titulo da minha tela");
		janela.setSize(300,200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);
		
		JButton botao = new JButton();
		botao.setText("Clique aqui: ");
		botao.setBounds(10, 10, 100, 20);
		
		//definir o componente JLabel de rotulo
		JLabel lblnome = new JLabel();
		lblnome.setText("Nome :");
		lblnome.setBounds(10, 40, 40, 20);
		
		//definir o campo de texto
		JTextField txtnome = new JTextField();
		txtnome.setBounds(50, 40, 100, 20);
		
		//add componentes na tela
		
		janela.getContentPane().add(botao);
		janela.getContentPane().add(lblnome);
		janela.getContentPane().add(txtnome);
		
		//Demonstrar janela
		janela.setVisible(true);

	}

}
