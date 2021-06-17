import javax.swing.JOptionPane;

public class AlgoritmoCpf {

	static int gerarNumeroEntre(int menorValor, int maiorValor) {
		int distancia = maiorValor - menorValor;
		return (int) (Math.random() * distancia) + menorValor;
	}

	static String formatarCpf(String txtCpf) {
		String[] arCpf = txtCpf.split("");
		int ctr = 0;
		String cpf = "";
		for (int i = 0; i <= 10; i++) {
			cpf += arCpf[i].toString();
			ctr++;
			if (ctr == 3 || ctr == 6) {
				cpf += ".";
			} else if (ctr == 9) {
				cpf += "-";
			}
		}
		return cpf;
	}

	public static void main(String[] args) {
		// EXEMPLO CPF começando com um array para a posição do indice e calculo
		int[] cpf = new int[11];
		String txtCpf = "";
		Object[] opcoes = { "Gerar CPF", "Validar CPF" };
		int opcao = JOptionPane.showOptionDialog(null, "Escolha", "Escolha", 0, JOptionPane.WARNING_MESSAGE, null,
				opcoes, opcoes[0]);
		// OPÇÃO DE ESCOLHA
		if (opcao == 1) {
			do {
				txtCpf = JOptionPane.showInputDialog("Digite o CPF: ");
			} while (txtCpf.length() != 11);

			String[] str = txtCpf.split("");
			for (int i = 0; i <= 8; i++) {
				cpf[i] = Integer.parseInt(str[i]);
			}
		} else {
			for (int i = 0; i <= 8; i++) {
				cpf[i] = gerarNumeroEntre(0, 9);
			}
		}

		// fazendo o laço de repetição
//		System.out.println("***PRIMEIRO DIGITO VERIFICADOR***");
		int p = 0;
		int soma = 0;
		for (int i = 10; i >= 2; i--) {
//			fazendo a multiplicação e soma conforme algoritmo do cpf para descobrir os dois verificadores finais
			int mult = i * cpf[p];
			soma = soma + mult;
//			System.out.println("i: " + i + ", p:" + p + ", cpf: " + cpf[p] + ", X:" + mult);
			p++;
//			cpf[p] = cpf[p] *i;
		}
//		System.out.println("Valor da soma: " + soma);
		// divisão da soma
//		int div = soma / 11;
//		System.out.println("Valor da divisão: " + div);
		// resto da divisão
		// primeiro verificador
		int resto = soma % 11;
//		System.out.println("Valor resto da divisão: " + resto);
		if (resto < 2) {
			cpf[9] = 0;
//			System.out.println("Primeiro digito verificador: " + cpf[9]);
		} else {
			cpf[9] = (11 - resto);
//			System.out.println("Primeiro digito verificador: " + cpf[9]);
		}

//		System.out.println("\n***SEGUNDO DIGITO VERIFICADOR***");
		p = 0;
		soma = 0;
		for (int i = 11; i >= 2; i--) {
//			fazendo a multiplicação e soma conforme algoritmo do cpf para descobrir os dois verificadores finais
			int mult = i * cpf[p];
			soma = soma + mult;
//			System.out.println("i: " + i + ", p:" + p + ", cpf: " + cpf[p] + ", X:" + mult);
			p++;
		}
//		System.out.println("Valor da soma: " + soma);
		// divisão da soma
//		div = soma / 11;
//		System.out.println("Valor da divisão: " + div);
		// resto da divisão
		// primeiro verificador
		resto = soma % 11;
//		System.out.println("Valor resto da divisão: " + resto);
		if (resto < 2) {
			cpf[10] = 0;
//			System.out.println("Segundo digito verificador: " + cpf[10]);
		} else {
			cpf[10] = (11 - resto);
//			System.out.println("Segundo digito verificador: " + cpf[10]);
		}
		// convertendo o array de inteiro em uma string cpf
		String cpfValido = "";
		for (int i = 0; i <= 10; i++) {
			cpfValido += cpf[i];
		}

		cpfValido = formatarCpf(cpfValido);

		String msg = "";
		if (cpfValido.equals(txtCpf) || opcao == 0) {
			msg = "Este CPF é valido: " + cpfValido;
		} else {
			txtCpf = formatarCpf(txtCpf);
			msg = "O CPF é invalido: " + txtCpf + " !- " + cpfValido;
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
