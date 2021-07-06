package lista1java;

import javax.swing.JOptionPane;

class Ex3 {

	public static void main(String[] args) {
	  
		int[] values = new int[3];
		int lowValues =0;
		int j = 0;
		for (int i=0; i<3; i++) {
			values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° valor: "));
			
			for (j=0; j<i; j++) {
				System.out.println(j);
				while(values[i] == values[j]) {
					values[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° valor corretamente: "));
					
				}
			}
		}
					
			for (int i=0; i<values.length; i++) {
			
			if (i==0) {
				
				if (values[i] > values[i+1]) {
					lowValues = values[i+1];	
				}else{
					lowValues = values[i];
				}
			}else if (lowValues > values[i]){
				lowValues = values[i]; 
			}
		}
		
		JOptionPane.showMessageDialog(null, lowValues, "É o menor valor", JOptionPane.INFORMATION_MESSAGE);
	}
}
