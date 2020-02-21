package exec9;

import javax.swing.JOptionPane;

public class SeparaDominio {

	public static void main(String[] args) {
		String email = (JOptionPane.showInputDialog(null, "Informe E-mail: ", "Validados de e-mail",0));
		//String email = (JOptionPane.showInputDialog("Informe E-mail: "));
		
		int cont = email.indexOf("@");
		System.out.println("Posição do @: " +cont);
		String dominio = email.substring(cont + 1);
		System.out.println("Dominio do email: "+dominio);
		if (cont > 0) {
			String usuario = email.substring(0, cont);
			System.out.println("Usuario ddo email: "  +usuario);
			
		}

	}

}
