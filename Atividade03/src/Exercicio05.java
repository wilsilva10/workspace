import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {
		// Sal�rio Funcion�rio
		Locale localeBR = new Locale("pt", "BR");
		int horasT = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas: "));
		double horasV = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora: "));
		float salario = (float) (horasT * horasV);

		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);

		JOptionPane.showMessageDialog(null, "O sal�rio �: " + dinheiro.format(salario));

	}

}
