package lista2java;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

class Ex2 {

	public static void main(String[] args) {
		
		double notes[] = new double[4];
		double totalNotes = 0;
		double media = 0;
		
		for (int i=0; i<4; i++) {
			notes[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a "+(1+i)+"° nota do aluno"));
			totalNotes = notes[i] + totalNotes;
		}
		
		media = totalNotes / 4;
				
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2); 
		
		if ((media >= 9.0) && (media <= 10)) {
			JOptionPane.showMessageDialog(null, "A = Média "+df.format(media)+"", "Conceito", JOptionPane.INFORMATION_MESSAGE);
		}else if ((media >= 8.0) && (media <= 8.9)) {
			JOptionPane.showMessageDialog(null, "B = Média "+df.format(media)+"", "Conceito", JOptionPane.INFORMATION_MESSAGE);
		}else if ((media >= 7.0) && (media <= 7.9)) {
			JOptionPane.showMessageDialog(null, "C = Média "+df.format(media)+"", "Conceito", JOptionPane.INFORMATION_MESSAGE);
		}else{
				JOptionPane.showMessageDialog(null, "D = Média "+df.format(media)+"", "Conceito", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
