package aula;

import javax.swing.JOptionPane;

public class exercicio2 {

	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		if(n1 % n2 == 0){
			JOptionPane.showMessageDialog(null, "O primeiro n�mero � divisivel pelo segundo");
		}else{
			JOptionPane.showMessageDialog(null, "O primeiro n�mero n�o � dividivel pelo segundo");
		}
	}

}
