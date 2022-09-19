package aula;

import javax.swing.JOptionPane;

public class exercicio6 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número: "));
		int cont = 1;

		while(cont <= num) {
			if (cont % 2 == 0) {
				System.out.println(cont);
			}
			cont++;
		}
	}

}

