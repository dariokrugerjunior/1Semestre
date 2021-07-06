package lista1java;

import javax.swing.JOptionPane;

class Ex5 {

	public static void main(String[] args) {
		
		int []numberUser = new int[10];
		int sumPair = 0;
		int sumOdd = 0;
		int contPair = 0;
		int contOdd = 0;
		
		
		
		for (int i=0; i<10; i++) {
			numberUser[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° valor: "));
		}
		
		for (int i=0; i<numberUser.length; i++) {
			
			if (numberUser[i] %2==0) {
				sumPair = numberUser[i] + sumPair;
				contPair = contPair + 1;
			}else{
				sumOdd = numberUser[i] + sumOdd;
				contOdd = contOdd + 1;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de numeros pares é "+contPair+" e a soma deles : "+sumPair+" ", "Par", JOptionPane.INFORMATION_MESSAGE);
		
	
		JOptionPane.showMessageDialog(null, "A quantidade de numeros impar é "+contOdd+" e a soma deles : "+sumOdd+" ", "Par", JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
