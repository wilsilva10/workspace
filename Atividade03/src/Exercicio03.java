import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Media e nota

		float a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		float b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		float media = (a + b) / 2;

//		Tentativa de fazer o n�mero par ficar sem quebrado do float 
//		if (media != 1) {			
//		JOptionPane.showMessageDialog(null, "A m�dia dos valores �: " + media);
//		} else {
//			int conversao = (int)Math.round(media);		
//			JOptionPane.showMessageDialog(null, "A m�dia dos valores �: " + conversao);
//		}
		JOptionPane.showMessageDialog(null, "A m�dia dos valores �: " + media);

	}

}
