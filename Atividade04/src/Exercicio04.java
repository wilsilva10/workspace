import javax.swing.JOptionPane;

public class Exercicio04 {

	public static void main(String[] args) {
//		4)Palavra de acesso
//	  Entrada > "Digite a palavra de acesso"
//	  Sa�da   > "Permiss�o: ??"
//	  // condi��es
//	  // se palavra digitada igual a Java-2021 Permiss�o: aprovada
//	  // se palavra digitada diferente de Java-2021 Permiss�o: Tente novamente N tentativas
//	  // limitar em 5 tentativas
//	>> use o m�todo equals
		String palavra = JOptionPane.showInputDialog(null, "Digite a palavra de acesso: ");
		String mensagem = "";
		 if (palavra.equals("Java-2021")) {
			mensagem = "Permiss�o Aprovada";
		}  else{
			for (int i = 1; i <= 5; i++) {
			JOptionPane.showInputDialog(null, "Tente novamente "+ i +" tentativas");
			}
		}
		 if(!mensagem.isEmpty()) {
			 JOptionPane.showMessageDialog(null, mensagem);
		 }else {
			 mensagem = "Permiss�o Negada";
			 JOptionPane.showMessageDialog(null, mensagem);
		 }
	
	}

}