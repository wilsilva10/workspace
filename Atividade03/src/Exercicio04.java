import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
		// 10% do gar�om

		double conta = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta: "));
		double desc = conta * 0.1;
		double total = conta - desc;

		JOptionPane.showMessageDialog(null, "10% do gar�om �: " + desc + "\n" + " O total a pagar �: " + total);

	}

}
