package aula;

import javax.swing.JOptionPane;

public class exercicioo12 {

	public static void main(String[] args) {
		int [] idades = new int[10];
		for (int i = 0; i < idades.length; i++){
			idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa" +(i+1)));
		}
		int cont18 = 0;
		for (int i = 0; i < idades.length; i++) {
			if(idades[i] >= 18) {
				cont18++;
			}
		}
		System.out.println("A quantidade de pessoas maiores de idade é: "+cont18);
		System.out.println("A quantidade de pessoas menores de idade é: "+(idades.length-cont18));
	}
}
