import javax.swing.JOptionPane;

public class Desafio01 {

	public static void main(String[] args) {
//		01:Ordenar N�meros
//		  Entrada > "Digite 1 n�mero"
//		  Entrada > "Digite 1 n�mero"
//		  Entrada > "Digite 1 n�mero"
//		  Sa�da   > "Os n�mero em ordem crescente: ? ? ?"
	
   

         int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
         int  n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
         int  n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 n�mero"));
         int aux = 0;
         
         if (n1 > n2) {
             aux = n1;
             n1 = n2;
             n2 = aux;
         }

         if (n2 > n3) {
             aux = n2;
             n2 = n3;
             n3 = aux;

         }
          
      
         if (n1 > n2) {
             aux = n1;
             n1 = n2;
             n2 = aux;
         }
          
          
          
         JOptionPane.showMessageDialog(null, "Os n�mero em ordem crescente: " + n1 + ", " + n2 + ", " + n3); 

	}

}
