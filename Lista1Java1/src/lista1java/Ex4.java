package lista1java;

import javax.swing.JOptionPane;

class Ex4 {

	public static void main(String[] args) {
		
		int sumPair = 0;
	
		int values01 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1° numero inteiro: "));
		
		int values02 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2° numero inteiro: "));	
		

		if (values01 == values02) {
			JOptionPane.showMessageDialog(null, "Numero iguais", "Numero digitados não há intervalos", JOptionPane.INFORMATION_MESSAGE);
		}else if(values01 > values02){
			
			for (int i=values02; i<values01; i++ ) {
				if(i%2==0) {
					sumPair = i + sumPair;
					System.out.println(sumPair);
					System.out.println(i);
				}
			}
			
		}else if(values01 < values02) {
			
			for (int i=values01; i<values02; i++) {
				if(i%2==0) {
					sumPair = i + sumPair;
					System.out.println(sumPair);
					System.out.println(i);
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, sumPair, "Soma dos numeros pares nesse intervalo", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(sumPair);
	}

}
