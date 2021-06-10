import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
//		3)Entre X e Y
//	  Entrada > "Digite 1 número"
//	  Entrada > "Digite 1 número"
//	  Saída > "Os números entre ? e ? são: ?, ?, ?, ? "
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, "Números iguais: " + num1 + " / " + num2);
		}
		else if(num1 < num2){
			for(int i= ++num1;  i<num2; i++) {			
				numeros.add(i);
			}
			JOptionPane.showMessageDialog(null, "Os números entre: " + --num1 + " / " + num2 +" são:  "+ numeros);
		}
		
		else if (num1 > num2){
			
			for(int i= --num1;  i>num2; i--) {			
				numeros.add(i);

			}
			JOptionPane.showMessageDialog(null, "Os números entre: " + ++num1 + " / " + num2 +" são:  "+ numeros);
		}
	}
}