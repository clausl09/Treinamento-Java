package exec11;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TesteGui06 {
	
	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbox;
	private String[] equipamentos = {"Monitos", "Teclado", "Mouse", "Scanner", "Modem"};
	
	
	
	
	public void iniciarGui() {
		
		//instanciar 
		janela = new JFrame("Exemplo de combo box");
		painelDaJanela = (JPanel) janela.getContentPane();
		cbox = new JComboBox(equipamentos);
		
		//configuraçoes do combo box
		cbox.setSelectedIndex(-1);
		cbox.setBounds(10, 10, 300, 30);
		cbox.setMaximumRowCount(10);
		
		//configuraçoes do painel de tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbox);
		
		//configuraçoes da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 300);
		janela.setVisible(true);
		
	}
	public static void main(String[] args) {
		new TesteGui06().iniciarGui();
	}
}
