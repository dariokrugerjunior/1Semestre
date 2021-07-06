package lista2java;

import javax.swing.JOptionPane;

class Ex4 {

	public static void main(String[] args) {
		double brass = 0;
		double zinc = 0;
		double cooper = 0;
		
		brass = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de latão em kg"));
		
		 zinc = brass*30/100;
		 cooper = brass*70/100;
		 
		 //System.out.println(zinc);
		 //System.out.println(cooper);
		 
		 JOptionPane.showMessageDialog(null, "Zinco = "+zinc+"Kg Cobre = "+cooper+"Kg", "Ingredientes", JOptionPane.INFORMATION_MESSAGE);
		 
		
		
		
	}
}
