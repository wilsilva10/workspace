
import javax.swing.JOptionPane;

public class Desafio02 {

	static int gerarPc() {
		return (int) (Math.random() * 3);
	}

	public static void main(String[] args) {
//		02:Game Pedra/Papel/Tesoura
//		  Entrada
//		  "Escolher entre as op��es [pedra,papel,tesoura]"
//		  ---
//		  Sa�da (enquanto resposta = sim)
//		  Eu(??) X Pc(??)
//		  Resultado: ?? 
//		  Jogar Novamente?
//		  Escolher entre: [Sim,N�o]
//		  ---
//		  Sa�da (quando resposta = n�o)
//		  Placar Final
//		  Vit�rias: ??
//		  Derrotas: ??
//		  Empate: ??

		
		int e = 0;
		int d = 0;
		int v = 0;
		int resultado;
//		int ret = JOptionPane.showOptionDialog(null, "GAME DESAFIO - ESCOLHA A OP��O: ", "**JoKenP�**", 0, JOptionPane.YES_NO_OPTION, null,
//				retorno, retorno[0]);
//		
		
		do {
			
			Object[] opcoes = { "PEDRA", "PAPEL", "TESOURA" };
			int usuario = JOptionPane.showOptionDialog(null, "GAME DESAFIO - ESCOLHA A OP��O: ", "**JoKenP�**", 0,
					JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			int computador = gerarPc();
			Object[] jogo = { "SIM", "N�O"};
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
				result = "Vit�ria";
				v++;
			} else {
				result = "Derrota";
				d++;
				
			}
			
			 resultado = JOptionPane.showOptionDialog(null, "Eu (" + escolhaU + ") " + " X Pc (" + escolhaPc + ")" + 
			"\nResultado: "+ result + "\nDeseja jogar novamente? ", 
			"**JoKenP�**", 0, JOptionPane.INFORMATION_MESSAGE, null,
			jogo, jogo[0]);
		} while(resultado !=1); 
			JOptionPane.showMessageDialog(null, "Placar final \n Vit�rias: "+v+"\n Derrotas: "+d+"\n Empates: "+e );
			
		
		
	}

}
