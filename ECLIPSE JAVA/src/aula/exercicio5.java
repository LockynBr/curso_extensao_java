package aula;

import javax.swing.JOptionPane;

public class exercicio5 {

	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro n�mero"));
		char operador = JOptionPane.showInputDialog("Escolha um operador entre (+ , - , * ou /)").charAt(0);
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo n�mero"));

		switch (operador) {

		case '+':
			JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + (n1+n2));
			break;
		case '-':
			JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + (n1-n2));
			break;
		case '*':
			JOptionPane.showMessageDialog(null, n1 + " * " + n2 + " = " + (n1*n2));
			break;
		case '/':
			if(n2 == 0) {
				JOptionPane.showMessageDialog(null, "N�o � possivel divis�o por 0");
			}else {
				JOptionPane.showMessageDialog(null, n1 + " / " + n2 + " = " + (n1/n2));
			}

			break;
		default:
			JOptionPane.showMessageDialog(null, "Operador Inv�lido");


		}
	}

}
