package lista3java;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class MetodosEx2 {

	public static void main(String[] args) {
		
		double grades[] = new double[3];
		int weight[] = new int[3];
		
		
		for (int i=0;i<3;i++) {
			grades[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1) + "º nota:"));
			while(grades[i]<0 || grades[i]>10) {
				JOptionPane.showMessageDialog(null, "Informe uma nota valida!");
				grades[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i+1) + "º nota:"));	
			}
			
		}
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Qual média deseja ?"
				+ "\n 1 - Média Aritimética"
				+ "\n 2 - Média Ponderada"));
		
		switch (option) {
		case 1:
			double arithmeticAv = calculatesArithmetic(grades);
			verificationAverage(arithmeticAv);
		break;
		case 2:
			for(int i=0;i<3;i++) {
				weight[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da " + (i+1) + "º nota"));
			}
			double weightedAv = calculatesWeighted(grades, weight);
			verificationAverage(weightedAv);
			break;
		}
	
	}
	
	public static double calculatesArithmetic(double[] grades) {
		
		double totalAverage = (grades[0]+ grades[1] + grades[2]) / 3;
		return totalAverage;
	}
	
	public static double calculatesWeighted (double[] grades, int[] weigth) {
		int totalWeigth = weigth[0] + weigth[1] + weigth[2];
		
		double totalAverage = ((grades[0]*weigth[0]) + (grades[1]*weigth[1]) + (grades[2]*weigth[2])) / totalWeigth;
		
		return totalAverage;
	}
	
	public static void verificationAverage (double totalAverage) {
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2); 
		
		if (totalAverage >= 7) {
			JOptionPane.showMessageDialog(null, "O aluno passou de ano, NOTA: "+df.format(totalAverage));
		}else{
			JOptionPane.showMessageDialog(null, "O aluno reprovou de ano, NOTA: "+df.format(totalAverage));
		}

	}
}
