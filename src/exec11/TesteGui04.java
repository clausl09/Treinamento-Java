package exec11;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class TesteGui04 {

	private JFrame janela;
	private JLabel lblEscolha;
	private JRadioButton rbtSolteiro;
	private JRadioButton rbtCasado;
	private JRadioButton rbtViuvo;
	private JRadioButton rbtDivorciado;
	private JButton btnVerificar;
	private JPanel painelDaJanela;
	private ButtonGroup grpRadio;

	public void iniciaGui() {

		// criar as instancias
		janela = new JFrame("Exemplo do Radio Button");
		lblEscolha = new JLabel();
		rbtSolteiro = new JRadioButton();
		rbtCasado = new JRadioButton();
		rbtViuvo = new JRadioButton();
		rbtDivorciado = new JRadioButton();
		btnVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// cria o objeto de grupo de botoes
		grpRadio = new ButtonGroup();

		// adiciona os botoes ao grupo
		grpRadio.add(rbtSolteiro);
		grpRadio.add(rbtCasado);
		grpRadio.add(rbtViuvo);
		grpRadio.add(rbtDivorciado);

		// configuraçoes da label escolha
		lblEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lblEscolha.setText("Slecione o estado civil: ");
		lblEscolha.setBounds(82, 18, 230, 18);

		// configuraçao do botao Solteiro
		rbtSolteiro.setText("Solteiro");
		rbtSolteiro.setBounds(80, 50, 100, 24);

		// configuraçao do botao Casado
		rbtCasado.setText("Casado");
		rbtCasado.setBounds(80, 75, 100, 24);

		// configuraçao do botao Viuvo
		rbtViuvo.setText("Viuvo");
		rbtViuvo.setBounds(80, 100, 100, 24);

		// configuraçao do botao Divorciado
		rbtDivorciado.setText("Divorciado");
		rbtDivorciado.setBounds(80, 125, 150, 24);

		// configutaçoes do botao
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(126, 176, 83, 28);

		// adicionar ação do botao
		btnVerificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				verificarSelecionado();
			}
		});

		// configuração do painel da tela
		painelDaJanela.setLayout(null);
		painelDaJanela.setBorder(BorderFactory.createLoweredBevelBorder());
		painelDaJanela.add(lblEscolha);
		painelDaJanela.add(rbtSolteiro);
		painelDaJanela.add(rbtCasado);
		painelDaJanela.add(rbtViuvo);
		painelDaJanela.add(rbtDivorciado);
		painelDaJanela.add(btnVerificar);

		// configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 273);
		janela.setVisible(true);

		// fim do metodo iniciaGui

	}

	public void verificarSelecionado() {
		// verificar qual Radio Button foi selecionado
		String resposta = "";
		if (rbtSolteiro.isSelected()) {
			resposta += rbtSolteiro.getText();
		}
		if (rbtCasado.isSelected()) {
			resposta += rbtCasado.getText();
		}
		if (rbtViuvo.isSelected()) {
			resposta += rbtViuvo.getText();
		}
		if (rbtDivorciado.isSelected()) {
			resposta += rbtDivorciado.getText();
		}
		// trocar a cor da fonte para vermelho
		if (!resposta.equals("")) {
			lblEscolha.setForeground(Color.RED);
			lblEscolha.setText(resposta);
		}
		resposta = "";
	}

	public static void main(String[] args) {
		new TesteGui04().iniciaGui();
	}
}
