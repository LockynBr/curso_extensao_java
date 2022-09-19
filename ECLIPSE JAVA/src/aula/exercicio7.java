package aula;

import javax.swing.JOptionPane;

public class exercicio7 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da tábuada: "));
		int cont = 1;
		while(cont <= 10) {
			System.out.println(cont + " X " + n1 + " = " + (cont*n1));
			cont++;
		}
		

	}

}
