package lista1java;

import javax.swing.JOptionPane;

class Ex2 {

	public static void main(String[] args) {
		
		int countryAge = Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade do seu País ou Estado"));
		
		int personAge = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		
		if (countryAge > personAge) {
			JOptionPane.showMessageDialog(null, "Você é menor de idade, a maioridade do pais é "+ countryAge +" e sua idade é "+ personAge +"", "Invalido", JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "Você é maior de idade, a maioridade do pais é "+ countryAge +" e sua idade é "+ personAge +"", "Valido", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}

	}

