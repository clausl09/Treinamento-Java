package exec11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TesteGui3 {

	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;
	
	public TesteGui3() {
		iniciaGui();
	}
	
	public void iniciaGui() {
		janela = new JFrame();
		area = new JTextArea();
		botao1 = new JButton("Clique aqui");
		botao1.addActionListener(new TextoListener());
		botao2 = new JButton("Troca cor");
		botao2.addActionListener(new CorListener());
		campo = new JTextField();
		campo.addActionListener(new TextoListener());
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);
		janela.setSize(300, 300);
		janela.setVisible(true);
	}
	public class TextoListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
				area.append(campo.getText()+ "\n");
				campo.setText("");
		}	
	}
	public class CorListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// se o fundo for neutro troca para preto
			if (area.getBackground().equals(Color.BLACK)) {
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);	
			}else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);
			}	
		}	
	}
	public static void main(String[] args) {
		new TesteGui3();
	}
}
