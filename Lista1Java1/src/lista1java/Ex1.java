package lista1java;

import javax.swing.JOptionPane;

class Ex1 {

	public static void main(String[] args) {
		
		int hours = Integer.parseInt(JOptionPane.showInputDialog("Informe o horario em horas "));
		
				int hoursSeconds = hours * 3600;
				
				int minutes = Integer.parseInt(JOptionPane.showInputDialog("Informe os minutos"));
				
				int minutesSeconds = minutes * 60;
					
				int seconds = Integer.parseInt(JOptionPane.showInputDialog("Informe os segundos"));
				
				int sumSeconds = hoursSeconds + minutesSeconds + seconds;
				
				JOptionPane.showMessageDialog(null, sumSeconds, "Quantidade em segundos ", JOptionPane.INFORMATION_MESSAGE);	
	}

}
