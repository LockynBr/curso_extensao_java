package aula;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class exercicioo11 {

	public static void main(String[] args) {
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
		DecimalFormat dc = new DecimalFormat("0. ##");
		String sf = dc.format(imc(peso, altura));
		JOptionPane.showMessageDialog(null, sf);
	}

	public static double imc(double peso, double altura) {
		double imc = (peso / Math.pow(altura, 2));
		return imc;
	}

}
