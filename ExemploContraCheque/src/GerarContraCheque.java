import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class GerarContraCheque {

	public static void main(String[] args) {
		// Exemplo contra cheque valor da hora 37.47
		float valorHora = 37.47f;
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
//		DecimalFormat df = new decimalFormat(); formatação de outra forma
//		df.applyPattern("#.##");

		String matricula = JOptionPane.showInputDialog("Digite a matricula: ");
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas trabalhada: "));
		float minutos = Float.parseFloat(JOptionPane.showInputDialog("Digite o restante dos minutos: "));

		// calculo de horas trabalhadas e conversão de minutos para horas
		// System.out.println((minutos / 60));
		float complementoHoras = minutos / 60;
		float salario = (horas * valorHora) + (complementoHoras * valorHora);

		// calculo DSR descanso semanal remunerado - diasUteis - domingosFeriados
		int diasUteis = 19;
		int domingosFeriados = 6;
		float dsr = (((horas + complementoHoras) / diasUteis) * domingosFeriados) * valorHora;
		// salarioBruto calculo
		float salarioBruto = salario + dsr;
		// salarioBruto = 4000f; // teste condição

		// Desconto INSS taxas atuais 2021
		float valorInss = 0;
		if (salarioBruto <= 1100) {
			valorInss = salarioBruto * 0.075f;
		} else if (salarioBruto >= 1101 && salarioBruto <= 2203.48) {
			valorInss = ((salarioBruto - 1100) * 0.09f) + 82.5f;
			// System.out.println(valorInss); teste condição e verificação o valor do inss
		} else if (salarioBruto >= 2203.49 && salarioBruto <= 3305.22) {
			valorInss = ((salarioBruto - 2203.48f) * 0.12f) + 181.81f;
			// System.out.println(valorInss);
		} else if (salarioBruto >= 3305.23 && salarioBruto <= 6433.57) {
			valorInss = ((salarioBruto - 3305.22f) * 0.14f) + 195.03f;
		} else {
			valorInss = 751.99f - 38.89f;
		}

		// Desconto imposto de renda taxas atuais 2021
		float valorIr = 0;

		if (salarioBruto >= 1903.99 && salarioBruto <= 2826.65) {
			valorIr = (salarioBruto * 0.075f) - 142.80f;
		} else if (salarioBruto >= 2826.66 && salarioBruto <= 3751.06) {
			valorIr = (salarioBruto * 0.15f) - 354.80f;
		} else if (salarioBruto >= 3751.07 && salarioBruto <= 4664.68) {
			valorIr = (salarioBruto * 0.225f) - 636.13f;
		} else if (salarioBruto > 4664.68) {
			valorIr = (salarioBruto * 0.275f) - 869.36f;
		}

		float salarioLiqui = salarioBruto - valorInss - valorIr;

		JOptionPane.showMessageDialog(null,
				"** CONTRA CHEQUE **\n" + "Matricula/Nome: " + matricula + " / " + nome + "\nSalário Base: "
						+ dinheiro.format(salario) + "\nValor DSR: " + dinheiro.format(dsr) + "\nValor INSS: "
						+ dinheiro.format(valorInss) + "\nValor do Imposto de Renda: " + dinheiro.format(valorIr)
						+ "\nValor salário bruto: " + dinheiro.format(salarioBruto) + "\nValor salário liquído: "
						+ dinheiro.format(salarioLiqui));
	}

}
