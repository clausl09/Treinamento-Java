package exec6;

import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.Calendar;

public class Aluno {
	String nome;
	int anoNascimento;
	String curso;
	String cidade;
	Calendar dataNascimento;

	public Aluno() {

	}

	public Aluno(String nome, int anoNascimento, String curso, String cidade, Calendar dataNascimento) {
		
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.curso = curso;
		this.cidade = cidade;
		this.dataNascimento = dataNascimento;
	}

	public int calculaAno() {
		//metodo para calcular o ano 
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		return year - anoNascimento;
	}

	public int calculaIdade() {
		//Metodo para calcular a idade
		String data = (new java.text.SimpleDateFormat("dd/MM/yyyy").format(new java.util.Date(System.currentTimeMillis())));
		
		String datas1[] = data.split("/");
		int ano1 = Integer.parseInt(datas1[2]);
		
		int ano2 = dataNascimento.getTime().getYear();
		
		int calcIdade = ano1-ano2;
		calcIdade = (calcIdade % 1000000/10000);
		
		return calcIdade;

	}

	public int calculaDiasVida(){
		//Metodo para calcular os dias de vida
		int ano2 = dataNascimento.getTime().getYear().getDays
		
		
		
		return 0;
	}

	public void exibirDados() {
		JOptionPane.showMessageDialog(null, "Nome do aluno: " + nome);
		JOptionPane.showMessageDialog(null, "Ano de nascimento do aluno: " + anoNascimento);
		JOptionPane.showMessageDialog(null, "Curso do aluno: " + curso);
		JOptionPane.showMessageDialog(null, "Cidade do aluno: " + cidade);
		JOptionPane.showMessageDialog(null, "Idade do aluno: " + calculaIdade());
		JOptionPane.showMessageDialog(null, "Dias vividos do aluno: " + calculaDiasVida());

	}
}
