package exec7;

import javax.swing.JOptionPane;

public class Locadora {

	static Carro vetorCarro[];
	static Carro variavel[];

	public static void main(String[] args) {

		vetorCarro = new Carro[11];
		Carro carro1 = new Carro("Opalla", "DYA-6938", 150, "Alcool", 12000, "Preta");
		vetorCarro[0] = carro1;
		Carro carro2 = new Carro("Uno", "YAS-6254", 120, "Gasolina", 23000, "Preto");
		vetorCarro[1] = carro2;
		Carro carro3 = new Carro("Palio", "TRE-0987", 130, "Gasolina", 10000, "Preto");
		vetorCarro[2] = carro3;
		Carro carro4 = new Carro("Compass", "TGR-1234", 180, "Flex", 12000, "Verde");
		vetorCarro[3] = carro4;
		Carro carro5 = new Carro("Audi A3", "THY-8547", 200, "Gasolina", 25000, "Preto");
		vetorCarro[4] = carro5;
		Carro carro6 = new Carro("Jetta", "TYR-8965", 220, "Flex", 50000, "Branco");
		vetorCarro[5] = carro6;
		Carro carro7 = new Carro("Fox", "YHU-0987", 130, "Flex", 27000, "Vermelho");
		vetorCarro[6] = carro7;
		Carro carro8 = new Carro("S10", "MJH-2549", 200, "Diesel", 90000, "Cinza");
		vetorCarro[7] = carro8;
		Carro carro9 = new Carro("Inpala", "POI-8522", 160, "Alcool", 54000, "Verde");
		vetorCarro[8] = carro9;
		Carro carro10 = new Carro("Kwid", "LKI-7853", 170, "Gasolina", 450000, "Branco");
		vetorCarro[9] = carro10;
		Carro carro11 = new Carro("Kwid", "LUI-9053", 170, "Gasolina", 450000, "Cinza");
		vetorCarro[10] = carro11;

		verificarEscolha();
	}

	public static void verificarEscolha() {

		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Informe qual opção irá escolher" + "\n" + "1 - Por modelo" + "\n" + "2 - Por Velovidade Maxima" + "\n"
				+ "3 - Por combustivel" + "\n" + "4 - Por cor" + "\n" + "9 - Para finalizar"));

		switch (escolha) {
		case 1:
			verificarModelo();
			break;
		case 2:
			verificarVelocidadeMax();
			break;
		case 3:
			verificarCombustivel();
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Escolha seu carro pela cor: ");
			break;

		case 9:
			JOptionPane.showMessageDialog(null, "Opção invalida");
		}

	}

	public static void verificarModelo() {
		boolean modelo = false;

		String verificarModelo = JOptionPane.showInputDialog("Digite o modelo que esta a procura: ");
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloCarro.equals(verificarModelo)) {
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Combustivel: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n";
			}
		}
		if (!modelo) {
			JOptionPane.showMessageDialog(null, "Não temos modelos compativeis em nosso estoque !!!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}
	}

	public static void verificarVelocidadeMax() {
		boolean velocidadeMax = false;

		int verificarVelocidadeMax = Integer
				.parseInt(JOptionPane.showInputDialog("Digite a velocidade maxima que esta a procura: "));
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].velocidadeMax == verificarVelocidadeMax) {
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Combustivel: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n";
			}

		}
		if (!velocidadeMax) {
			JOptionPane.showMessageDialog(null, "Não temos velocidade maxima compativeis em nosso estoque !!!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}
	}

	public static void verificarCombustivel() {
		boolean combustivel = false;

		String verificarCombustivel = JOptionPane.showInputDialog("Digite o tipo de combustivel que esta a procura: ");
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].combustivel.equals(verificarCombustivel)) {
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Combustivel: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n";
			}
		}
		if (!combustivel) {
			JOptionPane.showMessageDialog(null, "Não temos este time de combustivel compativeis em nosso estoque !!!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}
	}

	public static void verificarCor() {
		boolean cor = false;

		String verificarCor = JOptionPane.showInputDialog("Digite a cor que esta a procura: ");
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].cor.equals(verificarCor)) {
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Combustivel: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n";
			}
		}
		if (!cor) {
			JOptionPane.showMessageDialog(null, "Não temos esta cor compativeis em nosso estoque !!!");
			Repeticao();
		} else {
			JOptionPane.showMessageDialog(null, message);
			Repeticao();
		}
	}

	public static void exibirValoresOrdemCrescente() {
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor < vetorCarro[j].valor) {
					Carro aux = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = aux;
				}
			}
		}
	}

	public static void verificarCompra() {
		String modeloCompra = JOptionPane.showInputDialog("Digite seu modelo para compra: ");
		String corCompra = JOptionPane.showInputDialog("Digite sua cor para compra: ");
		String message = "";

		int j = 0;
		variavel = new Carro[10];
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloCarro.equals(modeloCompra) && (vetorCarro[i].cor.equals(corCompra))) {
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Combustivel: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n";

				variavel[j] = vetorCarro[i];

				j++;

				exibirValoresOrdemCrescente();

			}
		}
	}

	public static  void Repeticao() {
		
	}
}
