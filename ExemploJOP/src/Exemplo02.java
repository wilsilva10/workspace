import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sexo = JOptionPane.showInputDialog(null, "Digite o seu sexo: ");
		String mensagem = "";
		if (sexo.length() != 1) {
			mensagem = "Digite apenas uma letra";
		}
		else if (sexo.toUpperCase().equals("M")) {
			mensagem = "Masculino";
		} else if (sexo.toUpperCase().equals("F")) {
			mensagem = "Feminino";
		} else {
			mensagem = "Valor n�o encontrado!";

		}
		JOptionPane.showMessageDialog(null, mensagem);

//		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));
//		System.out.println("Idade: " + idade);
//		
//		if (idade >= 18) {
//			JOptionPane.showMessageDialog(null, "J� pode tirar a carteira de motorista!");
//		} else {
//			JOptionPane.showMessageDialog(null, "Ainda n�o pode tirar a carteira de motorista!");
//		}
	}

}
