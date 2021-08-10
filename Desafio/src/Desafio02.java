
import javax.swing.JOptionPane;

public class Desafio02 {

	static int gerarPc() {
		return (int) (Math.random() * 3);
	}

	public static void main(String[] args) {
//		02:Game Pedra/Papel/Tesoura
//		  Entrada
//		  "Escolher entre as opções [pedra,papel,tesoura]"
//		  ---
//		  Saída (enquanto resposta = sim)
//		  Eu(??) X Pc(??)
//		  Resultado: ?? 
//		  Jogar Novamente?
//		  Escolher entre: [Sim,Não]
//		  ---
//		  Saída (quando resposta = não)
//		  Placar Final
//		  Vitórias: ??
//		  Derrotas: ??
//		  Empate: ??

		
		int e = 0;
		int d = 0;
		int v = 0;
		int resultado;
//		int ret = JOptionPane.showOptionDialog(null, "GAME DESAFIO - ESCOLHA A OPÇÃO: ", "**JoKenPô**", 0, JOptionPane.YES_NO_OPTION, null,
//				retorno, retorno[0]);
//		
		
		do {
			
			Object[] opcoes = { "PEDRA", "PAPEL", "TESOURA" };
			int usuario = JOptionPane.showOptionDialog(null, "GAME DESAFIO - ESCOLHA A OPÇÃO: ", "**JoKenPô**", 0,
					JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			int computador = gerarPc();
			Object[] jogo = { "SIM", "NÃO"};
			// Chamada para saber qual a escolha do usuario
			String escolhaU = "";
			if (usuario == 0) {
				escolhaU = "PEDRA";
			} else if (usuario == 1) {
				escolhaU = "PAPEL";
			} else {
				escolhaU = "TESOURA";
			}
			// Chamada para saber qual a escolha do computador
			String escolhaPc = " ";
			switch (computador) {
			case 0:
				escolhaPc = "PEDRA";
				break;
			case 1:
				escolhaPc = "PAPEL";
				break;
			case 2:
				escolhaPc = "TESOURA";
				break;
			}
			// Logica do jogo para saber o resultado
		
			String result = "";
			if (usuario == computador) {
				result = "Empate ";
				e++;
			} else if ((usuario == 0 && computador == 2) || (usuario == 2 && computador == 1)
					|| (usuario == 1 && computador == 0)) {
				result = "Vitória";
				v++;
			} else {
				result = "Derrota";
				d++;
				
			}
			
			 resultado = JOptionPane.showOptionDialog(null, "Eu (" + escolhaU + ") " + " X Pc (" + escolhaPc + ")" + 
			"\nResultado: "+ result + "\nDeseja jogar novamente? ", 
			"**JoKenPô**", 0, JOptionPane.INFORMATION_MESSAGE, null,
			jogo, jogo[0]);
		} while(resultado !=1); 
			JOptionPane.showMessageDialog(null, "Placar final \n Vitórias: "+v+"\n Derrotas: "+d+"\n Empates: "+e );
			
		
		
	}

}
