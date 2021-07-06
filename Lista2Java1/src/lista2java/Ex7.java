package lista2java;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

class Ex7 {

	public static void main(String[] args) {
	
	double [][]notes = new double[4][3];	
	String matter = null;
	double []highestGrade = new double [3];
	double []smallerNumber = new double[3];
	double []totalNotes = new double[9];
	String matNotes = "";
	String fisNotes ="";
	String quiNotes ="";
	int []b1 = new int [3];
	int []b2 = new int [3];
	
	for (int lin=0; lin<4; lin++) {
		for(int col=0; col<3; col++) {
			
			switch (col) {
			case 0:
				matter = "Matematica";
				break;
			case 1:
				matter = "Fisica";
				break;
			case 2:
				matter = "Quimica";
				break;	
			}
			
			notes[lin][col] = Double.parseDouble(JOptionPane.showInputDialog("Informe as notas de "+matter+"° do "+(lin+1)+"° Bimestre"));	
		}
	}
	
	for (int lin=0; lin<4; lin++) {
		for(int col=0; col<3; col++) {
			
			if(lin==1) {
				smallerNumber[col] = notes[lin][col];
			}
			
			if (col==0) {
				totalNotes[0] = totalNotes[0] + notes[lin][0];
				
				if(notes[lin][0] > highestGrade[0]){
					highestGrade[0] = notes[lin][0];
					b1[0] = lin +1;
				}
				
				
				if(notes[lin][0] < smallerNumber[0]) {
					smallerNumber[0] = notes[lin][0];
					b2[0] = lin + 1;
				}
				
			}else if (col==1) {
				totalNotes[1] = totalNotes[1] + notes[lin][1];
				
				if(notes[lin][1] > highestGrade[1]){
				highestGrade[1] = notes[lin][1];	
				b1[1] = lin + 1;
				}
				
				
				if(notes[lin][1] < smallerNumber[1]) {
					smallerNumber[1] = notes[lin][1];
				b2[1] = lin + 1;
				}
				
			}else if (col==2) {
				totalNotes[2] = totalNotes[2] + notes[lin][2];
				
				if(notes[lin][2] > highestGrade[2]){
				highestGrade[2] = notes[lin][2];	
				b1[2] = lin + 1;
				}
				
				
				if(notes[lin][2] < smallerNumber[2]) {
					smallerNumber[2] = notes[lin][2];
				b2[2] = lin +1;
				} 
			} 	
		}
	}
	
	
	
	for (int lin=0; lin<4; lin++) {
		
		matNotes += (lin+1)+"º bimestre =" +notes[lin][0]
					+ "\n ";
		
		fisNotes += (lin+1)+"º bimestre =" +notes[lin][1]
				+ "\n ";
		
		quiNotes += (lin+1)+"º bimestre =" +notes[lin][2]
				+ "\n ";
		}
	
	
	totalNotes[0] = totalNotes[0] / 4;
	totalNotes[1] = totalNotes[1] / 4;
	totalNotes[2] = totalNotes[2] / 4;
	
	DecimalFormat df = new DecimalFormat();
	df.setMaximumFractionDigits(2); 
	
	
	
	boolean verification;
	
	do {
		
		int option = Integer.parseInt(JOptionPane.showInputDialog("Oque você deseja ver ?"
				+ "\n 1 - Notas de todas as diciplinas"
				+ "\n 2 - A maior nota e em qual disciplina"
				+ "\n 3 - A menor nota e em qual disciplina"
				+ "\n 4 - A média das notas de alguma disciplina"
				+ "\n 5 - As notas de um dos bimestres"
				+ "\n 6 - Encerrar"));
		
		switch (option) {
		
		case 1:
			verification = true;
			
				for(int g=0; g<3; g++) {
				
					switch (g) {
					case 0:
						matter = "Matematica";
						JOptionPane.showMessageDialog(null, matNotes, matter, JOptionPane.INFORMATION_MESSAGE);
						break;
					case 1:
						matter = "Fisica";
						JOptionPane.showMessageDialog(null, fisNotes, matter, JOptionPane.INFORMATION_MESSAGE);
						break;
					case 2:
						matter = "Quimica";
						JOptionPane.showMessageDialog(null, quiNotes, matter, JOptionPane.INFORMATION_MESSAGE);
						break;	
					}
				}
			break;
		case 2:
			verification = true;
			int option01 = Integer.parseInt(JOptionPane.showInputDialog("Qual diciplina ?"
					+ "\n 1 - Matematica"
					+ "\n 2 - Fisica"
					+ "\n 3 - Quimica"));
			switch (option01) {
			case 1:
				matter = "Matematica";
				JOptionPane.showMessageDialog(null, ""+(b1[0])+"º Bimestre: "+highestGrade[0]+"", matter, JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				matter = "Fisica";
				JOptionPane.showMessageDialog(null, ""+(b1[1])+"º Bimestre: "+highestGrade[1]+"", matter, JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				matter = "Quimica";
				JOptionPane.showMessageDialog(null, ""+(b1[2])+"º Bimestre: "+highestGrade[2]+"", matter, JOptionPane.INFORMATION_MESSAGE);
			break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
			break;
			}
			break;
		case 3:
			verification = true;
			 int option02 = Integer.parseInt(JOptionPane.showInputDialog("Qual diciplina ?"
					+ "\n 1 - Matematica"
					+ "\n 2 - Fisica"
					+ "\n 3 - Quimica"));
				switch (option02) {
				case 1:
					matter = "Matematica";
					JOptionPane.showMessageDialog(null, ""+(b2[0])+"º Bimestre: "+smallerNumber[0]+"", matter, JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:
					matter = "Fisica";
					JOptionPane.showMessageDialog(null, ""+(b2[1])+"º Bimestre: "+smallerNumber[1]+"", matter, JOptionPane.INFORMATION_MESSAGE);
					break;
				case 3:
					matter = "Quimica";
					JOptionPane.showMessageDialog(null, ""+(b2[2])+"º Bimestre: "+smallerNumber[2]+"", matter, JOptionPane.INFORMATION_MESSAGE);
				break;
				default:
					JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
				}
				break;
		case 4: 
			verification = true;
			int option03 = Integer.parseInt(JOptionPane.showInputDialog("Qual diciplina ?"
						+ "\n 1 - Matematica"
						+ "\n 2 - Fisica"
						+ "\n 3 - Quimica"));
			 
			 switch (option03) {
			 case 1:
				 matter = "Matematica";
				 JOptionPane.showMessageDialog(null, "A media das notas: "+df.format(totalNotes[0])+"", matter, JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 2:
				 matter = "Fisica";
				 JOptionPane.showMessageDialog(null, "A media das notas: "+df.format(totalNotes[1])+"", matter, JOptionPane.INFORMATION_MESSAGE);
				 break;
			 case 3: 
				 matter = "Quimica";
				 JOptionPane.showMessageDialog(null, "A media das notas: "+df.format(totalNotes[2])+"", matter, JOptionPane.INFORMATION_MESSAGE);
				 break;
			 default:
				 JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				 break;
			 }
			 break;
		case 5:
			verification = true;
			int option04 = Integer.parseInt(JOptionPane.showInputDialog("Qual bimestre ?"
					+ "\n 1 - 1º"
					+ "\n 2 - 2º"
					+ "\n 3 - 3º"));
			
			switch (option04) {
			case 1:
				JOptionPane.showMessageDialog(null, "Matematica: "+notes[0][0]+"", "1º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Fisica: "+notes[0][1]+"", "1º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Quimica: "+notes[0][2]+"", "1º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "Matematica: "+notes[1][0]+"", "2º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Fisica: "+notes[1][1]+"", "2º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Quimica: "+notes[1][2]+"", "2º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Matematica: "+notes[2][0]+"", "3º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Fisica: "+notes[2][1]+"", "3º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Quimica: "+notes[2][2]+"", "3º Bimestre", JOptionPane.INFORMATION_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			break;
		case 6:
			verification = true;
			System.exit(0);
			break;
		}
	}while(verification = true);	
}
	
}
