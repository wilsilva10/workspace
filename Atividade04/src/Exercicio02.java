import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
//		2)Maior número
//	  Entrada > "Digite 1 número"
//	  Entrada > "Digite 1 número"
//	  Saída   > "O maior número é ??"
//	  // condições
//	  // se os números digitados forem igual a saída deve ser "Número iguais."

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

		if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "Números iguais: " + num1 + " / " + num2);
		} else if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O maior número é: " + num1);
		} else {
			JOptionPane.showMessageDialog(null, "O maior número é: " + num2);
		}

	}

}
