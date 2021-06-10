import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
//		4)Palavra de acesso
//	  Entrada > "Digite a palavra de acesso"
//	  Saída   > "Permissão: ??"
//	  // condições
//	  // se palavra digitada igual a Java-2021 Permissão: aprovada
//	  // se palavra digitada diferente de Java-2021 Permissão: Tente novamente N tentativas
//	  // limitar em 5 tentativas
//	>> use o método equals
		String palavra = JOptionPane.showInputDialog(null, "Digite a palavra de acesso: ");
		String mensagem = "";
		 if (palavra.equals("Java-2021")) {
			mensagem = "Permissão Aprovada";
		}  else{
			for (int i = 1; i <= 5; i++) {
			JOptionPane.showInputDialog(null, "Tente novamente "+ i +" tentativas");
			}
		}
		 if(!mensagem.isEmpty()) {
			 JOptionPane.showMessageDialog(null, mensagem);
		 }else {
			 mensagem = "Permissão Negada";
			 JOptionPane.showMessageDialog(null, mensagem);
		 }
	
	}

}