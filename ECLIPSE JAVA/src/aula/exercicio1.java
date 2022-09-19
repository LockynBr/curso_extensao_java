package aula;

import javax.swing.JOptionPane;

public class exercicio1 {

	public static void main(String[] args) {
		String base = JOptionPane.showInputDialog("Digite a base do triângulo: ");
		String altura = JOptionPane.showInputDialog("Digite a altura do triâgulo: ");
		double baseDouble = Double.parseDouble(base);
		double alturaDouble = Double.parseDouble(altura);
		JOptionPane.showMessageDialog(null, (baseDouble*alturaDouble) / 2);
				
	}

}
