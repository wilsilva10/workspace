

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
//		3)Entre X e Y
//	  Entrada > "Digite 1 número"
//	  Entrada > "Digite 1 número"
//	  Saída > "Os números entre ? e ? são: ?, ?, ?, ? "
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 número"));
		
		String numeros = "";
		int[] ns = new int[n2 - n1 -1];
		int cont = 0;
		for(int i = (n1 + 1); i <= (n2 -1); i++) {
			numeros = numeros + i +",";
			ns[cont++] = i;
		}
		System.out.println(java.util.Arrays.toString(ns));
		System.out.println(ns.toString());
		JOptionPane.showMessageDialog(null, "Os números entre "+n1+" e "+n2+" são: "+numeros);
	}
}