package aula;

import javax.swing.JOptionPane;

public class exercicio9a {

	public static void main(String[] args) {
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado: "));

		for(int i = 0 ;i < lado; i++) {
			for(int j = 0; j < lado; j++) {
				if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1 || i == j || i + j == lado -1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}

