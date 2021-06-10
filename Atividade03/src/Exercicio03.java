import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Media e nota

		float a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		float b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		float media = (a + b) / 2;

//		Tentativa de fazer o número par ficar sem quebrado do float 
//		if (media != 1) {			
//		JOptionPane.showMessageDialog(null, "A média dos valores é: " + media);
//		} else {
//			int conversao = (int)Math.round(media);		
//			JOptionPane.showMessageDialog(null, "A média dos valores é: " + conversao);
//		}
		JOptionPane.showMessageDialog(null, "A média dos valores é: " + media);

	}

}
