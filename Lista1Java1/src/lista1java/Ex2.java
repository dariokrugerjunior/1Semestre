package lista1java;

import javax.swing.JOptionPane;

class Ex2 {

	public static void main(String[] args) {
		
		int countryAge = Integer.parseInt(JOptionPane.showInputDialog("Informe a maioridade do seu Pa�s ou Estado"));
		
		int personAge = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		
		if (countryAge > personAge) {
			JOptionPane.showMessageDialog(null, "Voc� � menor de idade, a maioridade do pais � "+ countryAge +" e sua idade � "+ personAge +"", "Invalido", JOptionPane.INFORMATION_MESSAGE);
		}else{
			JOptionPane.showMessageDialog(null, "Voc� � maior de idade, a maioridade do pais � "+ countryAge +" e sua idade � "+ personAge +"", "Valido", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}

	}

