import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Pessoa pes = new Pessoa();
		
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		int diaNas = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do seu aniversário: "));
		int mesNas = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu aniversário: "));
		int anoNas = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do seu aniversário: "));
		
				
		pes.setNome(nome);
		pes.setAltura(altura);
		pes.setDiaNas(diaNas);
		pes.setMesNas(mesNas);
		pes.setAnoNas(anoNas);
		
		JOptionPane.showMessageDialog(null, pes.infPes());		
		
	}
}