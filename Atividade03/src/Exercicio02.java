import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Soma de valores
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		int soma = a + b;

		JOptionPane.showMessageDialog(null, "A soma dos valores �: " + soma);
	}

}
