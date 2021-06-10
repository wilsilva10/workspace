import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Exemplo 01 JOptionPane", "ALERTA", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showConfirmDialog(null, "Deseja continuar??", "ALERTA", JOptionPane.YES_NO_OPTION);
		Object[] options = { "OK", "Cancelar", "VOLTAR" };
		JOptionPane.showOptionDialog(null, "Clique para continuar", "Alerta", JOptionPane.DEFAULT_OPTION,
				JOptionPane.WARNING_MESSAGE, null, options, options[0]);
		String texto = JOptionPane.showInputDialog("Escreva uma mensagem!");
		System.out.println("A mensagem digitada foi:"+ texto);
		
		 Object[] itens = { "Exemplo1", "Exemplo2", "Exemplo2"};
		    Object escolhaItem = JOptionPane.showInputDialog(null, 
		    		"escolha um item", "Itens", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
		    System.out.println("Item selecionado: "+ escolhaItem.toString());
				 
		
	
				
		
	}

}
