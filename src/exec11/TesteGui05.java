package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TesteGui05 {
	private JFrame janela;
	private JLabel lblEscolha;
	private JLabel lblResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btnResposta;
	private JPanel painelDaJanela;
	
	public void iniciaGui() {
		
		//criar as instancias
		janela = new JFrame("Exemplo de Check Box");
		lblEscolha = new JLabel();
		lblResposta = new JLabel();
		cbCC = new JCheckBox();
		cbBB = new JCheckBox();
		cbDB = new JCheckBox();
		btnResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();
		
		// configiraçoes da label escolha 
		lblEscolha.setForeground(Color.RED);
		lblEscolha.setText("Escolha a forma de pagamento");
		lblEscolha.setBounds(45, 15, 208, 18);
		
		// configuraçoes da label Resposta
		lblResposta.setForeground(Color.BLUE);
		lblResposta.setText("Escolha a forma de pagamento");
		lblResposta.setBounds(42, 230, 300, 18);
		
		//configuraçoes do check box cartao de credito
		cbCC.setText("Cartão de credito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);
		
		//configuraçoes do check box deposito bancario
		cbDB.setText("Deposito bancário");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 145, 24);
		
		//configuraçoes do check box boleto bancario
		cbBB.setText("Boleto bancário");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);
		
		//coniguraçoes do botao
		btnResposta.setText("Resposta");
		btnResposta.setBounds(146, 196, 83, 28);
		
		//configuraçoes do botao resposta
		btnResposta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				verificarSelecionado();
				
			}
		});
		
		//adicionar componentes do paineel de tela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btnResposta);
		painelDaJanela.add(lblResposta);
		
		//configuraçoes da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setVisible(true);		
	}//fim do metodo iniciaGui
	
	public void verificarSelecionado() {
		// verificar qual Radio Button foi selecionado
		String resposta = "";
		if (cbCC.isSelected()) {
			resposta += cbCC.getText();
		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();
		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();
		}
		if (!resposta.equals("")) {
			lblResposta.setText(resposta);
		}
		resposta = "";
	}
	
	public static void main(String[] args) {
		new TesteGui05().iniciaGui();
	}
}//fim da classe
