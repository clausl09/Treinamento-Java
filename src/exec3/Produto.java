package exec3;

/**
 * classe crianda para armazenar a class Produtos
 * @author csleite
 * @since 11/02/2020
 */

public class Produto {
	 
		String nome = "Computador";
		int quantidade = 1000;
		int custo = 2980;
		int quanVendida = 10;
		double percLucro = 0.6;
		
		
		public void exibirNome(){
			boolean condition = false;
			if (condition) {
				System.out.println("Meu nome é : "+nome);
			}
			
		}
		
		public void exibirValor(){
			System.out.println("Aonde gastei : "+((percLucro*custo)+custo));
			
		}
		
		public void exibirLucro(){
			System.out.println("Aonde lucrei : "+ (percLucro*custo));
		}
		
		public void exibirTudo(){
			exibirNome();
			exibirValor();
			exibirLucro();
		}
}
