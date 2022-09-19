package aula;

import javax.swing.JOptionPane;

public class Curso {

	public static void main(String[] args) {
		//		JOptionPane.showMessageDialog(null, "Hello, Word!");
		double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da cricuferencia:"));
		JOptionPane.showMessageDialog(null, Math.PI*raio*raio);
	}

}
