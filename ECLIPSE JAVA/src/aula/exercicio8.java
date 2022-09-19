package aula;

import javax.swing.JOptionPane;

public class exercicio8 {

	public static void main(String[] args) {
		int cont = 1;
		int maiordeidade = 0;
		
		while (cont <= 10){
			int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
			if (idade >= 18) {
				maiordeidade = maiordeidade + 1;
			}
			cont++;
		}
		JOptionPane.showMessageDialog(null, "A quantidade de pessoas que possuem 18 anos ou mais é: " + maiordeidade);
	}
}
