package exec8;

import javax.swing.JOptionPane;

/**
 * Classe responsável por demonstrar o fluxo de saque de um caixa eletrônico com
 * notas de 2, 5, 10, 20 e 50
 * 
 * @author Diego Munhoz
 * @since 17/02/2020
 * @version 0.1
 */

public class CaixaEletronico {// inicio da classe

	public static void main(String[] args) {// inicio do método main

		// Declaração das variáveis utilizadas no programa
		try {

		int valorSacado = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o valor", "Calculadora", 1));
		int notaCinquenta = 0;
		int notaVinte = 0;
		int notaDez = 0;
		int notaCinco = 0;
		int notaDois = 0;

		// Inicio dos condicionais para calculo de notas

		if (valorSacado < 0) {
			JOptionPane.showMessageDialog(null, "O valor precisar ser acima de 0 !!!");
		}
		if (valorSacado == 11) {
			notaCinco = 1;
			notaDois = 3;
			valorSacado = (valorSacado - 11);
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
		}
		if (valorSacado == 111) {
			notaCinquenta = 2;
			notaCinco = 1;
			notaDois = 3;
			valorSacado = (valorSacado - 111);
			JOptionPane.showMessageDialog(null, "Notas de Cinquenta: " + notaCinquenta);
			JOptionPane.showMessageDialog(null, "Notas de Vinte: " + notaVinte);
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
		}
		if (valorSacado == 103) {
			notaCinquenta = 1;
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 103);
			JOptionPane.showMessageDialog(null, "Notas de Cinquenta: " + notaCinquenta);
			JOptionPane.showMessageDialog(null, "Notas de Vinte: " + notaVinte);
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
		}
		if (valorSacado == 53) {
			notaVinte = 2;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 53);
			JOptionPane.showMessageDialog(null, "Notas de Vinte: " + notaVinte);
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
		} else if (valorSacado >= 50) {
			notaCinquenta = (valorSacado / 50);
			valorSacado = (valorSacado - (notaCinquenta * 50));
			JOptionPane.showMessageDialog(null, "Notas de Cinquenta: " + notaCinquenta);
		}
		if (valorSacado == 43) {
			notaVinte = 1;
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = (valorSacado - 43);
			JOptionPane.showMessageDialog(null, "Notas de Vinte: " + notaVinte);
			JOptionPane.showMessageDialog(null, "Notas de Dez: " + notaDez);
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
		}
		if (valorSacado == 23) {
			notaDez = 1;
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 23;
			JOptionPane.showMessageDialog(null, "Notas de Dez: " + notaDez);
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
		} else if (valorSacado >= 20) {
			notaVinte = (valorSacado / 20);
			valorSacado = (valorSacado - (notaVinte * 20));
			JOptionPane.showMessageDialog(null, "Notas de Vinte: " + notaVinte);
		}
		if (valorSacado == 13) {
			notaCinco = 1;
			notaDois = 4;
			valorSacado = valorSacado - 13;
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
		} else if (valorSacado >= 10) {
			notaDez = (valorSacado / 10);
			valorSacado = (valorSacado - (notaDez * 10));
			JOptionPane.showMessageDialog(null, "Notas de Dez: " + notaDez);
		}

		switch (valorSacado) {
		case 9:
			notaCinco = 1;
			notaDois = 2;
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
			break;
		case 8:
			notaDois = 4;
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
			break;
		case 7:
			notaCinco = 1;
			notaDois = 1;
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
			break;
		case 6:
			notaDois = 3;
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
			break;
		case 5:
			notaCinco = 1;
			JOptionPane.showMessageDialog(null, "Notas de Cinco: " + notaCinco);
			break;
		case 4:
			notaDois = 2;
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
			break;
		case 3:
			notaDois = 1;
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
			break;
		case 2:
			notaDois = 1;
			JOptionPane.showMessageDialog(null, "Notas de Dois: " + notaDois);
			break;
		}
		}
		
			
			catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Digite somente numeros !!!");
			}
			
		}// fim do método main

}// fim da classe

