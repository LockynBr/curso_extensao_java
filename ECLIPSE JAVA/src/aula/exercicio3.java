package aula;

import javax.swing.JOptionPane;

public class exercicio3 {

	public static void main(String[] args) {
		Double litros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros que você vai abastecer: "));
		double valor = 4.58;
		double total = litros * valor;
		if(litros > 20){
		double desconto = total - total*0.05;
			JOptionPane.showMessageDialog(null, desconto);
		}else{
			JOptionPane.showMessageDialog(null, litros * valor);
		}
	}

}
