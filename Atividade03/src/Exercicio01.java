import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Mostrar n�meros vizinhos

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero: "));
		int a = numero - 1;
		int b = numero + 1;

		JOptionPane.showMessageDialog(null,
				"O primeiro n�mero vizinho de " + numero + " �: " + a + "\n" + "O segundo n�mero vizinho de " + numero + " �: " + b);

	}

}
