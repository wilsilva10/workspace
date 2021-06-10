import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Mostrar números vizinhos

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		int a = numero - 1;
		int b = numero + 1;

		JOptionPane.showMessageDialog(null,
				"O primeiro número vizinho de " + numero + " é: " + a + "\n" + "O segundo número vizinho de " + numero + " é: " + b);

	}

}
