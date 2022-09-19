package aula;

import javax.swing.JOptionPane;

public class exercicio4 {

	public static void main(String[] args) {
		char sexo = JOptionPane.showInputDialog("Digite o sexo: (m ou f)").toLowerCase().charAt(0);

		switch (sexo) {

		case 'm':
			JOptionPane.showMessageDialog(null, "Sexo Masculino");
			break;
		case 'f':
			JOptionPane.showMessageDialog(null, "Sexo Feminino");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Inválido");
			break;
		}
	}

}
