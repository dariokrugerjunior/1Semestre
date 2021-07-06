package lista2java;

import javax.swing.JOptionPane;

class Ex3 {

	public static void main(String[] args) {
		int values = 0;
		boolean verification = false;
		boolean verify = false;
		
		values = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero inteiro"));
		
		
		while(verify = true){
			
			verification = false;
			
			int option = Integer.parseInt(JOptionPane.showInputDialog("Oque você deseja fazer ?"
					+ "\n 1 - Verificar se o número é múltiplo do numero que informar"
					+ "\n 2 - Verificar se o número é par"
					+ "\n 3 - Verificar se o número está entre 0 e 1000"
					+ "\n 4 - Sair"));
			switch(option) {
			case 1:
				verify = true;
				int multiple = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero para verificar se é multiplo de "+values+""));
				
				if (values%multiple==0) {
					verification = true;
				}
				
				if (verification==true) {
					JOptionPane.showMessageDialog(null, "Os numeros são multiplos", "Verdadeiro", JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "Os numeros NÃO são multiplos", "Falso", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				
			case 2:
				verify = true;
				if (values%2==0) {
					verification = true;	
				}
				
				if (verification==true) {
					JOptionPane.showMessageDialog(null, "O numero é par", "Verdadeiro", JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "O numero é impar", "Falso", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				
			case 3:
				verify = true;
				if ((values > 0) && (values <= 1000)) {
					verification = true;	
				}
				
				if (verification==true) {
					JOptionPane.showMessageDialog(null, "O numero esta entre 1000", "Verdadeiro", JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null, "O numero não esta entre 1000", "Falso", JOptionPane.INFORMATION_MESSAGE);
				}
				break;
				
			case 4:
				verify = false;
				System.exit(0);
				break;
			default:
				verify = true;
				JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		}
	}
}
