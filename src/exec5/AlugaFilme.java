package exec5;

import javax.swing.JOptionPane;

/**
 * classe crianda para organizar a locação de filme
 * 
 * @author csleite
 * @since 12/02/2020
 */

public class AlugaFilme {

	double valorAluguel = 56;
	double valorPago;
	double valorTroco;
	int diasAluguel;
	String filme;
	boolean filmeInceptionDisponivel = true;
	boolean filmeStolenDisponivel = false;

	public AlugaFilme() {
		processar();
	}
	// feita para processar
	private void processar() {
		if (verificarDisponibilidade(escolhaFilme())) {
			System.out.println("Filme Disponivel");
		}else {
			System.out.println("FIlme Indisponivel");
		}
	}
	
//
	//Feita para organizar a escolhaFilme
	public String escolhaFilme() {
		if (JOptionPane.showInputDialog("Informe o filme desejado: ") == "1") {
			return "1";
		}
			if (JOptionPane.showInputDialog("Informe o filme desejado: ") == "2") {
				return "2";
			}
		else {
			return"O filme não foi encontrado!!!";
		}
		
	}
	

	// verificando se o filme esta disponivel
	public boolean verificarDisponibilidade(String num) {
		if (num == "1") {
			if (filmeInceptionDisponivel) {
				return true;
			} else {
				return false;
			}
		} else {
			if (filmeStolenDisponivel) {
				return true;
			} else {
				return false;
			}
		}
	}
	public void calculaValor(int diasAluguel, double valorAluguel, double valorPago) {
		double total = diasAluguel * valorAluguel;
		if (total == valorPago) {
			System.out.println("Filme alugado com sucesso");
		}else if (total > valorPago) {
			System.out.println("Valor pago insulficiente");
		}else {
			double troco = valorPago - total;
			System.out.println("Filme alugado com sucesso !!! troco: "+troco);
		}
	
	}

	public static void main(String[] args) {
		new AlugaFilme();
	}
}

