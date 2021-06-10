
public class AlgoritmoCpf {

	public static void main(String[] args) {
		// EXEMPLO CPF começando com um array para a posição do indice e calculo
		int[] cpf = new int[11];
		cpf[0] = 1;
		cpf[1] = 1;
		cpf[2] = 1;
		cpf[3] = 4;
		cpf[4] = 4;
		cpf[5] = 4;
		cpf[6] = 7;
		cpf[7] = 7;
		cpf[8] = 7;
		// fazendo o laço de repetição
		System.out.println("***PRIMEIRO DIGITO VERIFICADOR***");
		int p = 0;
		int soma = 0;
		for (int i = 10; i >= 2; i--) {
//			fazendo a multiplicação e soma conforme algoritmo do cpf para descobrir os dois verificadores finais
			int mult = i * cpf[p];
			soma = soma + mult;
			System.out.println("i: " + i + ", p:" + p + ", cpf: " + cpf[p] + ", X:" + mult);
			p++;
//			cpf[p] = cpf[p] *i;
		}
		System.out.println("Valor da soma: " + soma);
		// divisão da soma
		int div = soma / 11;
		System.out.println("Valor da divisão: " + div);
		// resto da divisão
		// primeiro verificador
		int resto = soma % 11;
		System.out.println("Valor resto da divisão: " + resto);
		if (resto < 2) {
			cpf[9] = 0;
			System.out.println("Primeiro digito verificador: " + cpf[9]);
		} else {
			cpf[9] = (11 - resto);
			System.out.println("Primeiro digito verificador: " + cpf[9]);
		}
		
		System.out.println("\n***SEGUNDO DIGITO VERIFICADOR***");
		p = 0;
		soma = 0;
		for (int i = 11; i >= 2; i--) {
//			fazendo a multiplicação e soma conforme algoritmo do cpf para descobrir os dois verificadores finais
			int mult = i * cpf[p];
			soma = soma + mult;
			System.out.println("i: " + i + ", p:" + p + ", cpf: " + cpf[p] + ", X:" + mult);
			p++;
		}
		System.out.println("Valor da soma: " + soma);
		// divisão da soma
		div = soma / 11;
		System.out.println("Valor da divisão: " + div);
		// resto da divisão
		// primeiro verificador
		resto = soma % 11;
		System.out.println("Valor resto da divisão: " + resto);
		if (resto < 2) {
			cpf[10] = 0;
			System.out.println("Segundo digito verificador: " + cpf[10]);
		} else {
			cpf[10] = (11 - resto);
			System.out.println("Segundo digito verificador: " + cpf[10]);
		}
		for(int i = 0; i<=10; i++) {
			System.out.print(cpf[i]);
		}
	}

}
