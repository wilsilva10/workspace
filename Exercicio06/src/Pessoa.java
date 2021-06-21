import java.time.LocalDate;

public class Pessoa {
	private String nome;
	private double altura;
	private int diaNas;
	private int mesNas;
	private int anoNas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getDiaNas() {
		return diaNas;
	}
	public void setDiaNas(int diaNas) {
		this.diaNas = diaNas;
	}
	public int getMesNas() {
		return mesNas;
	}
	public void setMesNas(int mesNas) {
		this.mesNas = mesNas;
	}
	public int getAnoNas() {
		return anoNas;
	}
	public void setAnoNas(int anoNas) {
		this.anoNas = anoNas;
	}
	public int idade() {
		
		LocalDate data = LocalDate.now();
		int ano = data.getYear();
		int idade = ano - this.getAnoNas();
		
		return idade;
	}
	
	public String infPes() {
		return "Dados" 
			 + "\n" + "nome: " + this.getNome()
			 + "\n" + "data de nascimento: " + this.getDiaNas() +"/"+this.getMesNas()+"/"+this.getAnoNas()
			 + "\n" + "idade: " + idade()
			 + "\n" + "altura: " + this.getAltura();
	}
	
	
}