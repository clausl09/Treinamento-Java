package exec11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class TesteGui07 {
	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu01;
	private JMenu menu02;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JPanel painalDaJanela;

	public void iniciarGui() {

		// criar as intancias
		janela = new JFrame("Exemplo de menu");
		barraMenu = new JMenuBar();
		menu01 = new JMenu("Menu 1");
		menu02 = new JMenu("Menu 2");
		itemMenu1 = new JMenuItem("Item1");
		itemMenu2 = new JMenuItem("Item2");
		painalDaJanela = (JPanel) janela.getContentPane();

		// acrescentar menus na barra de menus
		barraMenu.add(menu01);
		barraMenu.add(menu02);

		// acrescentar item de menu nos menus
		menu01.add(itemMenu1);
		menu02.add(itemMenu2);
		
		//configurando a açao do item de menu 1 
		itemMenu1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new TesteGui04().iniciaGui();
				
			}
		});
		
		//configurando a açao do item de menu 2 
				itemMenu2.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						new TesteGui05().iniciaGui();
						
					}
				});

		// configuraçoes de painelDaJanela
		painalDaJanela.setLayout(null);
		painalDaJanela.add(barraMenu);

		// configuraçoes da tela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(300, 300);
		janela.setVisible(true);

	}
	public static void main(String[] args) {
		new TesteGui07().iniciarGui();
		
	}
}
