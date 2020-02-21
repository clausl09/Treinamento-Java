package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.sun.javafx.image.impl.ByteIndexed.Getter;

public class TesteGui10 {
	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private String[] colunas = new String[] { "uf", "Estado" };
	private String[][] dados = new String[][] { { "SP", "São Paulo" }, { "RJ", "Rio de Janeiro" },
			{ "RN", "Rio Grande do Norte" }, { "PR", "Paraná" } };
	private JLabel lblIncluirUF;
	private JLabel lblIncluirEstado;
	private JTextField jtfInlcuirUf;
	private JTextField jtfInlcuirEstado;
	private JButton botaoIncluir;
	private JButton botaoExcluir;
	private JScrollPane painelDeScroll;

	public void iniciaGui() {

		// instanciar
		janela = new JFrame("Exemplo da tabela");
		lblIncluirUF = new JLabel("Informe o UF");
		lblIncluirEstado = new JLabel("Informe o Estado");
		jtfInlcuirUf = new JTextField();
		jtfInlcuirEstado = new JTextField();
		botaoIncluir = new JButton("Incluir");
		botaoExcluir = new JButton("Excluir");

		painelDaJanela = (JPanel) janela.getContentPane();

		// criar a tabela, colocando os atributos em um modelos de dados
		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);

		tabela.setEnabled(true);

		// instanciando e inserindo a tabela no scroll
		painelDeScroll = new JScrollPane(tabela);
		painelDeScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

		painelDeScroll.setBounds(10, 100, 360, 95);
		tabela.setBounds(10, 30, 300, 95);
		botaoIncluir.setBounds(75, 200, 100, 50);
		botaoExcluir.setBounds(195, 200, 100, 50);
		lblIncluirUF.setBounds(15, 20, 70, 25);
		lblIncluirEstado.setBounds(15, 55, 90, 25);
		jtfInlcuirUf.setBounds(110, 20, 50, 25);
		jtfInlcuirEstado.setBounds(110, 55, 260, 25);

		// Adicionar Acoes no botao
		botaoIncluir.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				adicionaLinha();

			}

		});
		
		botaoExcluir.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				excluirLinha();
				
			}

		});

		painelDaJanela.setLayout(null);
		painelDaJanela.add(lblIncluirUF);
		painelDaJanela.add(lblIncluirEstado);
		painelDaJanela.add(jtfInlcuirUf);
		painelDaJanela.add(jtfInlcuirEstado);
		painelDaJanela.add(painelDeScroll);
		painelDaJanela.add(botaoIncluir);
		painelDaJanela.add(botaoExcluir);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400, 300);
		janela.setVisible(true);

	}// fim do metodo iniciaGui

	public void adicionaLinha() {
		if (jtfInlcuirUf.getText().contentEquals("") || jtfInlcuirEstado.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Campo UF e Estado obrigatório");
		} else {
			// obrter o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// adicionar lova linha com os dados
			modelo.addRow(new String[] { jtfInlcuirUf.getText(), jtfInlcuirEstado.getText() });
			jtfInlcuirUf.setText("");
			jtfInlcuirEstado.setText("");
			JOptionPane.showMessageDialog(null, "Dados incluidos com sucesso!");
		}

	}// Fim do metodo adicionarLinha

	public void excluirLinha() {
		if(tabela.getSelectedRow() == -1){
		JOptionPane.showMessageDialog(null, "Selecione uma linha para ser excluida");
		}else if (tabela.getSelectedRowCount() > 1){
		JOptionPane.showMessageDialog(null, "Selecione apenas uma linha");
		}else {
			// obrter o modelo da tabela criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Excluido com sucesso");
		}
		
		
	}
	
	public static void main(String[] args) {
		new TesteGui10().iniciaGui();
	}// Fim do main
}// Fim da class
