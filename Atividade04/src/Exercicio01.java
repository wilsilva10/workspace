import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
//		// 1)Status Aluno
//		  Entrada > "Digite o nome do aluno"
//		  Entrada > "Digite a nota final"
//		  Sa�da   > "O aluno ?? esta ?? com a nota ??"
//		  // condi��es
//		  // nota maior ou igual 7 'Aprovado'
//		  // nota entre 4 e 7 'Recupera��o'
//		  // nota menor que 4 'Reprovado'
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		int notaF = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua nota final: "));
		String resultado = "";
		if (notaF >= 7) {
			resultado = "Aprovado";
		}else if (notaF >= 4 && notaF <=7) {
			resultado = "Recupera��o";
		}else if(notaF < 4){
			resultado = "Reprovado";
		}

		JOptionPane.showMessageDialog(null,
				"O aluno " + nome + " est� com a situa��o: " + resultado + ", com a nota: "+notaF);



	}

}
