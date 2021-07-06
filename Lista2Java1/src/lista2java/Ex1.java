package lista2java;

import javax.swing.JOptionPane;

class Ex1 {

	public static void main(String[] args) {
	
		int vetor = 0;
		boolean verification = false;
		
		vetor = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do vetor"));
	
		int[] values = new int [vetor];
		
		for (int i=0; i<vetor; i++) {
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do "+(1+i)+"° Vetor"));
		}
		
		for (int i=0; i<vetor; i++) {
			if (values[i] < 0) {
				JOptionPane.showMessageDialog(null, "O numero informado é negativo = "+values[i]+"", "Numero Negativo", JOptionPane.INFORMATION_MESSAGE);
				verification = true;
			}
		}
		
		if (verification == false) {
			JOptionPane.showMessageDialog(null, "Nenhum numero é negativo", "Numero Negativo", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
