import javax.swing.JOptionPane;

public class Desafio01 {

	public static void main(String[] args) {
//		01:Ordenar N�meros
//		  Entrada > "Digite 1 n�mero"
//		  Entrada > "Digite 1 n�mero"
//		  Entrada > "Digite 1 n�mero"
//		  Sa�da   > "Os n�mero em ordem crescente: ? ? ?"

		String numeros = "";
		// criando uma lista int
		int[] ord = new int[3];
		int posAnterior;

		// Entrada com os numeros

		for (int i = 0; i < ord.length; i++) {
			ord[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero: "));
		}
		// realizando a opera��o para percorrer a lista int ord ate 3
		for (int i = 0; i < ord.length; i++) {
			// realizando a comparacao da lista ex: terceira posicao verifica se e maior das
			// demais posicoes por isso o -1
			for (int j = 0; j < ord.length - 1; j++) {
				if (ord[j] > ord[j + 1]) {
					posAnterior = ord[j];
					ord[j] = ord[j + 1];
					ord[j + 1] = posAnterior;
				}

			}
		}
		// for para pegar os valores da lista ord para imprimir na tela
		for (int k = 0; k < ord.length; k++) {
			numeros = numeros + ord[k] + ",";

		}

		System.out.println(java.util.Arrays.toString(ord));
		System.out.println(ord.toString());
		JOptionPane.showMessageDialog(null, "Os n�meros em ordem crescente: " + numeros);

	}

}
