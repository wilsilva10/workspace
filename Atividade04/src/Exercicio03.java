import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
//		3)Entre X e Y
//	  Entrada > "Digite 1 n�mero"
//	  Entrada > "Digite 1 n�mero"
//	  Sa�da > "Os n�meros entre ? e ? s�o: ?, ?, ?, ? "
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, "N�meros iguais: " + num1 + " / " + num2);
		}
		else if(num1 < num2){
			for(int i= ++num1;  i<num2; i++) {			
				numeros.add(i);
			}
			JOptionPane.showMessageDialog(null, "Os n�meros entre: " + --num1 + " / " + num2 +" s�o:  "+ numeros);
		}
		
		else if (num1 > num2){
			
			for(int i= --num1;  i>num2; i--) {			
				numeros.add(i);

			}
			JOptionPane.showMessageDialog(null, "Os n�meros entre: " + ++num1 + " / " + num2 +" s�o:  "+ numeros);
		}
	}
}