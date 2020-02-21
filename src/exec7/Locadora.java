package exec7;

import javax.swing.JOptionPane;

public class Locadora {

	static Carro vetorCarro[];
	static Carro variavel[];

	public static void main(String[] args) {

		vetorCarro = new Carro[11];
		Carro carro1 = new Carro("opalla", "DYA-6938", 150, "alcool", 12000, "preta");
		vetorCarro[0] = carro1;
		Carro carro2 = new Carro("uno", "YAS-6254", 120, "gasolina", 23000, "preto");
		vetorCarro[1] = carro2;
		Carro carro3 = new Carro("palio", "TRE-0987", 130, "gasolina", 10000, "preto");
		vetorCarro[2] = carro3;
		Carro carro4 = new Carro("compass", "TGR-1234", 180, "flex", 12000, "verde");
		vetorCarro[3] = carro4;
		Carro carro5 = new Carro("audi A3", "THY-8547", 200, "gasolina", 25000, "preto");
		vetorCarro[4] = carro5;
		Carro carro6 = new Carro("jetta", "TYR-8965", 220, "flex", 50000, "branco");
		vetorCarro[5] = carro6;
		Carro carro7 = new Carro("fox", "YHU-0987", 130, "flex", 27000, "vermelho");
		vetorCarro[6] = carro7;
		Carro carro8 = new Carro("s10", "MJH-2549", 200, "diesel", 90000, "cinza");
		vetorCarro[7] = carro8;
		Carro carro9 = new Carro("inpala", "POI-8522", 160, "alcool", 54000, "verde");
		vetorCarro[8] = carro9;
		Carro carro10 = new Carro("kwid", "LKI-7853", 170, "gasolina", 450000, "branco");
		vetorCarro[9] = carro10;
		Carro carro11 = new Carro("kwid", "LUI-9053", 170, "gasolina", 450000, "cinza");
		vetorCarro[10] = carro11;

		verificarEscolha();
	}

	public static void verificarEscolha() {
		boolean loop = true;

		while (loop) {

			int escolha = Integer.parseInt(JOptionPane.showInputDialog(
					"Informe qual opção irá escolher" + "\n" + "1 - Por modelo" + "\n" + "2 - Por Velovidade Maxima"
							+ "\n" + "3 - Por combustivel" + "\n" + "4 - Por cor" + "\n"+"5 - Tudos os carros ordem decrescente (valor)"+"\n" + "9 - Para finalizar"));

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
				verificarCor();
				break;
			case 5:
				exibirValoresOrdemDecrescente();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Escolha seu carro pela cor: ");
				break;

			case 9:
				JOptionPane.showMessageDialog(null, "Opção invalida");
			}
		}

	}

	public static void verificarModelo() {
		boolean modelo = false;

		String modeloCarro = JOptionPane.showInputDialog("Digite o modelo que esta a procura: ").toLowerCase();
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			if (vetorCarro[i].modeloCarro.equals(modeloCarro)) {
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Placa: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n" + "\n Combustivel: " + vetorCarro[i].combustivel;
			modelo = true;
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
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Placa: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n" + "\n Combustivel: " + vetorCarro[i].combustivel;
				velocidadeMax = true;
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
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Placa: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n" + "\n Combustivel: " + vetorCarro[i].combustivel;
				combustivel = true;
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
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Placa: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n" + "\n Combustivel: " + vetorCarro[i].combustivel;
				cor = true;
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

	public static void exibirValoresOrdemDecrescente() {
		String message = "";
		for (int i = 0; i < vetorCarro.length; i++) {
			for (int j = 0; j < vetorCarro.length; j++) {
				if (vetorCarro[i].valor > vetorCarro[j].valor) {
					Carro aux = vetorCarro[i];
					vetorCarro[i] = vetorCarro[j];
					vetorCarro[j] = aux;
					
					message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Placa: "
							+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
							+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
							+ "\n" + "\n Combustivel: " + vetorCarro[i].combustivel;
				}
			}
			JOptionPane.showMessageDialog(null, message);
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
				message = message + "\n Modelo: " + vetorCarro[i].modeloCarro + "\n" + "\n Placa: "
						+ vetorCarro[i].placaCarro + "\n" + "\n Valor do carro: " + vetorCarro[i].valor + "\n"
						+ "\n Velocidade máxima: " + vetorCarro[i].velocidadeMax + "\n" + "\n Cor: " + vetorCarro[i].cor
						+ "\n" + "\n Combustivel: " + vetorCarro[i].combustivel;

				variavel[j] = vetorCarro[i];

				j++;

				exibirValoresOrdemDecrescente();

			}
		}
	}

	public static void Repeticao() {
		verificarEscolha();
	}
}
