package exec6;

import javax.swing.JOptionPane;
import org.joda.time.DateTime;
import org.joda.time.Days;


public class TestAluno {
	
	public static void main(String[] args) {
		
		String dataCompleta = JOptionPane.showInputDialog("Imforme a data de nascimento ");
		String data1[] = dataCompleta.split("/");
		int ano1 = Integer.parseInt(data1[2]);
		int mes1 = Integer.parseInt(data1[1]);
		int dia1 = Integer.parseInt(data1[0]);
		
		String data = (new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date(System.currentTimeMillis())));
		String data2[] = data.split("/");
		int ano2 = Integer.parseInt(data2[2]);
		int mes2 = Integer.parseInt(data2[1]);
		int dia2 = Integer.parseInt(data2[0]);
		
		DateTime dataInicial = new DateTime(ano1, mes1 , dia1, 0, 0);
		DateTime dataFinal = new DateTime(ano2, mes2 , dia2, 0, 0);
		
		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();
		
		System.out.println(dias+"\n"+dias);
	}

}
