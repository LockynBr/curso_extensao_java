package aula;

import javax.swing.JOptionPane;

public class exercicioo13 {

	public static void main(String[] args) {
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o lado: "));
		char[] [] m = new char [lado] [lado];

		for(int i = 0 ;i < lado; i++) {
			for(int j = 0; j < lado; j++) {
				if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1 || i == j || i + j == lado -1) {
					m [i] [j]='*';
				}else {
					m [i] [j]=' ';
				}
			}
		}

		for (int i = 0; i< lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print(m [i] [j]);
			}
			System.out.println();
		}


	}
}

