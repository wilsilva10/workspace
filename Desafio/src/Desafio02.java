
import javax.swing.JOptionPane;

public class Desafio02 {

	static int gerarPc(int pc) {
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
		
		Object[] opcoes = { "PEDRA", "PAPEL", "TESOURA" };
		int usuario = JOptionPane.showOptionDialog(null, "GAME DESAFIO - ESCOLHA A OP��O: ", "**JoKenP�**", 0,
				JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
		int computador = gerarPc(3);
//		Object[] retorno = { "SIM", "N�O" };
//		int ret = JOptionPane.showOptionDialog(null, "GAME DESAFIO - ESCOLHA A OP��O: ", "**JoKenP�**", 0, JOptionPane.YES_NO_OPTION, null,
//				retorno, retorno[0]);
//		
		String escolhaPc = "";
		switch (computador) {
		case 0:
			escolhaPc = "PEDRA";
		case 1:
			escolhaPc = "PAPEL";
		case 2:
			escolhaPc = "TESOURA";
		}
		
		String msg = "";

		if (usuario == computador) {
			msg = "Eu("+usuario+")"+" X Pc("+escolhaPc+")"+"\nEmpate";
		} else if ((usuario == 0 && computador == 2) || (usuario == 2 && computador == 1)
				|| (usuario == 1 && computador == 0)) {
			msg = "Eu("+usuario+")"+" X Pc("+escolhaPc+")"+"\nUsuario ganhou !";
		} else {
			msg = "Eu("+usuario+")"+" X Pc("+escolhaPc+")"+"\nComputador ganhou !";
		}
		JOptionPane.showMessageDialog(null, msg);
	}

}
