import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		boolean repetir = true;

		do {
			try {
				Pessoa p1 = new Pessoa();

				p1.setNome(JOptionPane.showInputDialog("Digite o nome: "));
				DateTimeFormatter formatoDt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				p1.setDataNasc(LocalDate.parse(
						JOptionPane.showInputDialog("Digite a data de nascimento no formato DD/MM/AAAA: "), formatoDt));
				p1.setAltura(Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: ").replace(",", ".")));

				JOptionPane.showMessageDialog(null, p1.dados());
				repetir = false;
			} catch (NumberFormatException nfe) {
				JOptionPane.showMessageDialog(null, "Valor númerico inválido! ");
			}

			catch (DateTimeParseException dtpe) {
				JOptionPane.showMessageDialog(null, "Data de Nasciomento inválida! ");
			}

			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ALGO DEU ERRRADO");

			}
		} while (repetir = false);

	}
}