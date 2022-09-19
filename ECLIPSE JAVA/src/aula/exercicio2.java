package aula;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		if(n1 % n2 == 0){
			JOptionPane.showMessageDialog(null, "O primeiro número é divisivel pelo segundo");
		}else{
			JOptionPane.showMessageDialog(null, "O primeiro número não é dividivel pelo segundo");
		}
	}

}
