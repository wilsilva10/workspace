import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
//		2)Maior n�mero
//	  Entrada > "Digite 1 n�mero"
//	  Entrada > "Digite 1 n�mero"
//	  Sa�da   > "O maior n�mero � ??"
//	  // condi��es
//	  // se os n�meros digitados forem igual a sa�da deve ser "N�mero iguais."

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));

		if (num1 == num2) {
			JOptionPane.showMessageDialog(null, "N�meros iguais: " + num1 + " / " + num2);
		} else if (num1 > num2) {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: " + num1);
		} else {
			JOptionPane.showMessageDialog(null, "O maior n�mero �: " + num2);
		}

	}

}
