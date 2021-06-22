import java.time.LocalDate;


public class Pessoa {
	private String nome;
	private LocalDate dataNasc;
	private float altura;

	// calculo idade pessoa
	public int idade() {
		LocalDate hoje = LocalDate.now();
		int idade = hoje.getYear() - dataNasc.getYear();
		if (dataNasc.getMonthValue() > hoje.getMonthValue() || dataNasc.getMonthValue() > hoje.getMonthValue()
				&& (dataNasc.getDayOfMonth() > hoje.getDayOfMonth())) {
			idade--;
		}
		return idade;
	}

	// imprimir todos os dados da pessoa
	public String dados() {
		return "Dados da pessoa" + "\n Nome: " + nome + "\nData Nascimento: " + dataNasc+ "\nAltura: " + altura
				+ "\nIdade: " + idade();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

}