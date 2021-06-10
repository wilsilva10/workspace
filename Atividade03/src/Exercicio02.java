import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Soma de valores
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		int soma = a + b;

		JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);
	}

}
