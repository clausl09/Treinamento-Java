package exec9;

public class Matematica {

	public static void main(String[] args) {
		double x = 10, y = 20.5, z = -30;
		//valor absoluto
		double abs = Math.abs(z);
		
		System.out.println("Numero: " +abs);
		//Arredonda para o numero inteiro mais alto
		double ceil = Math.ceil(y);
		System.out.println("Retorna menor valor Inteiro: " +ceil);
		//Arredonda para o numero inteiro mais baixo
		double floor = Math.floor(y);
		System.out.println("Retorna o numero inteiro mais baixo: " +floor);
		//Calcula logaritmo
		double log = Math.log(x);
		System.out.println("Logaritmo: " +log);
		//Verifica qual o maior
		double max = Math.max(x, y);
		System.out.println("Mais valor é: " +max);
		//Verifica qual o menor
		double min = Math.min(x, y);
		System.out.println("Mais valor é: " +min);
		//Calcula potencia
		double pow = Math.pow(x, 6);
		System.out.println("Elevado: " +pow);
		//Raiz quadrada
		double sqrt = Math.sqrt(x);
		System.out.println("Raiz:" +sqrt);
		//Coseno
		double cos = Math.cos(y);
		System.out.println("Coseno: " +cos);
		//Seno
		double sin = Math.sin(y);
		System.out.println("Seno: " +sin);
		//Tangente
		double tan = Math.tan(y);
		System.out.println("Tangente: " +tan);
	}

}
