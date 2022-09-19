package aula;

import javax.swing.JOptionPane;

public class exercicioo10 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um núimero"));
		
		JOptionPane.showMessageDialog(null, nPares(num));
		
		JOptionPane.showMessageDialog(null, nPares(10));
		
		JOptionPane.showMessageDialog(null, nPares(15));
		
		JOptionPane.showMessageDialog(null, nPares(20));
	}
	public static String nPares(int n) {
		int contPares = 0;
		String pares = "";
		for(int i = 1; contPares < n; i++) {
			if(i % 2 == 0) {
				pares+=" "+i;
				contPares++;
			}
		}
		return pares;
	}
}
