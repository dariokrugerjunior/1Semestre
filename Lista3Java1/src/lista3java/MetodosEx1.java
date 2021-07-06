package lista3java;

import javax.swing.JOptionPane;

public class MetodosEx1 {

	public static void main(String[] args) {
		int birth = 0;
	
		birth = askYears();
		
		calculateAge(birth);		
	}
	
	public static int askYears () {
		
		int years = 0;
		years = Integer.parseInt(
				JOptionPane.showInputDialog("informe sua data de nacimento"));
		
		return years;
	}
	
	public static void calculateAge (int years) {
		
		int year = 2021 - years;
		
		JOptionPane.showMessageDialog(null, "Sua idade em 2021 será "+year);
	}
}
