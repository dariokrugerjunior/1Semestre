package lista1java;

import javax.swing.JOptionPane;

class Ex6 {

	public static void main(String[] args) {
	
		int values01 = 0;
		int values02 = 0;
		int resultValues = 0;
		values01 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1° valor: "));
	
		String repeat;
		
		do {
			int option = Integer.parseInt(JOptionPane.showInputDialog("Oque você deseja ver ?"
					+ "\n 1 - Somar"
					+ "\n 2 - Subtrair"
					+ "\n 3 - Multiplicar"
					+ "\n 4 - Dividir"));
			
			values02 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2° valor: "));
			
			switch (option) {
			case 1: 
				resultValues = values01 + values02;
				JOptionPane.showMessageDialog(null, resultValues, "A soma dos numeros", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 2:
				resultValues= values01 - values02;
				JOptionPane.showMessageDialog(null, resultValues, "A subtração dos numeros", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			case 3:
				resultValues = values01 * values02;
				JOptionPane.showMessageDialog(null, resultValues, "A multiplicação dos numeros", JOptionPane.INFORMATION_MESSAGE);
				break;
			
			case 4:
				resultValues = values01 / values02;
				int restValues = values01 % values02;
				JOptionPane.showMessageDialog(null, "Total da divisão é "+resultValues+ " E o resto da divisão é "+restValues+"", "A divisão dos numeros", JOptionPane.INFORMATION_MESSAGE);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				}
			
			repeat = JOptionPane.showInputDialog("Deseja fazer outro calculo usando o ultimo valor ?"
					 + "\n Digite S para sim ou outro caractere para encerrar:");  
			
			values01 = resultValues;
			
			}while(repeat.equals("s") || repeat.equals("S"));
	}

}
