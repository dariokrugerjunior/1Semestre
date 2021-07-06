package jogodavelha;

import javax.swing.JOptionPane;

public class JogoDaVelha {

	public static void main(String[] args) {
		String []	name = new String [2];
		String [][] table = new String [3][3];
		String returnB = "";
		int counter = 0;
		
		interFace(name);
		
		fillMatriz(table, counter);
		
		startPlay(table, returnB, counter, name);
		
		
		}	
		
	public static void  interFace (String [] name) {

		JOptionPane.showMessageDialog(null, "Bem vindo ao jogo da Véia !!");

		for (int i=0;i<2;i++) {

			name[i] = JOptionPane.showInputDialog((i+1)+"º jogador: ");
		}

	}
	
	public static void fillMatriz (String[][]table, int counter) {
		
		for (int l=0; l<3;l++) {
			for (int c=0; c<3;c++) {
				counter= counter+ 1;
				table [l][c] = String.valueOf(counter);

			}
		}
	}
	
	public static String snowBoard (String [][]table, String returnB) {
	
		for(int l=0; l<3; l++) {
			
			
			for(int c=0; c<3; c++) {
				
				returnB += "|";
				returnB += ""+ table[l][c] ;
			}
			returnB +="|";
			returnB +="\n";
			}
			
		return returnB;
	}
	
	public static void startPlay (String[][] table, String returnB, int counter, String[]name) {
		int rest = 0;
		boolean winner = false;
		int position = 0;
		int plays = 0;
		boolean verification = false;
		String optionPlay = "";
		
		
		do{
			
			if(rest%2==0) {
				optionPlay = "X";
				JOptionPane.showMessageDialog(null,name[0]+ " é a sua vez");
			}else{
				optionPlay = "O";
				JOptionPane.showMessageDialog(null,name[1]+ " é a sua vez");
			}		
			
			do {
				
				position = Integer.parseInt(JOptionPane.showInputDialog(snowBoard(table, returnB)
						+"\n Informe a posição que deseja que jogar"));
				
				verification = checkerPositionInfor(position, table);
			
				if (verification == true) {
					rest = rest + 1;
					plays = plays + 1;
				}
				
			}while(verification == false);
			
			switch(position) {
			case 1:
					table[0][0] = optionPlay;
				break;
			case 2:
					table[0][1] = optionPlay;
				break;
			case 3:
					table[0][2] = optionPlay;
				break;
			case 4:
					table[1][0] = optionPlay;
				break;
			case 5:
					table[1][1] = optionPlay;
				break;
			case 6:
					table[1][2] = optionPlay;
				break;
			case 7:
					table[2][0] = optionPlay;
				break;
			case 8:
					table[2][1] = optionPlay;
				break;
			case 9:	
					table[2][2] = optionPlay;
				break;
			}	
			
			
			winner = checkerWinner(plays, table, name);

		}while(winner == false);
		
		if (winner == true) {
			checkerNewGame(winner, plays, name, table, returnB, counter);
		}
	} // termina jogada
	
	public static boolean checkerPositionInfor(int position, String[][] table) {
		
		int information = 0;
		
		if(position <=0 || position >= 10) {
			JOptionPane.showMessageDialog(null, "A posição informada é incorreta!");
			return false;
		}
		
		for(int l=0; l<3; l++) {
			for(int c=0; c<3; c++) {
				if (table[l][c].equals(String.valueOf(position))) {
				information = information +1;
				return true;
				}
			}
		}
		
		if(information != 1) {
			JOptionPane.showMessageDialog(null, "A posição informada já esta em uso!");
		}
		
		return false;
			
	}
	
	public static boolean checkerWinner(int plays, String[][] table, String[] name) {
		boolean winner = false;
		if(plays >= 5) {
			//validação Horizontal
			if ((table[0][0] == table[0][1]) && (table[0][0] == table[0][2])) {
				
				switch (table[0][0]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
			}else if ((table[1][0] == table[1][1]) && (table[1][0] == table[1][2])) {
				
				switch (table[1][0]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
			}else if((table[2][0] == table[2][1]) && (table[2][0] == table[2][2])) {
				
				switch (table[2][0]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
				// VALIDAÇÃO VERTICAL
				
			//linha[] coluna[]
			}else if((table[0][0] == table[1][0]) && (table[0][0] == table[2][0])) {
				
				switch (table[0][0]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
			}else if((table[0][1] == table[1][1]) && (table[0][1] == table[2][1])) {
				
				switch (table[0][1]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
				
			}else if((table[0][2] == table[1][2]) && (table[0][2] == table[2][2])) {
				
				switch (table[0][2]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
				// validação vertical
			}else if((table[0][0] == table[1][1]) && (table[0][0] == table[2][2])) {
				
				switch (table[0][0]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
			}else if((table[0][2] == table[1][1]) && (table[0][2] == table[2][0])) {
				
				switch (table[0][2]) {
				case "X":
					JOptionPane.showMessageDialog(null, name[0]+" Você ganhou!! ");
					winner = true;
					break;
				case "O":
					JOptionPane.showMessageDialog(null, name[1]+" Você ganhou!! ");
					winner = true;
					break;
				}
				// validação se continua jogando
			}else if (plays == 9) {
				JOptionPane.showMessageDialog(null, "Deu velha");
				winner = true;
			}else{
				winner = false;
			}
		}
		return winner;
	}
	public static void checkerNewGame (boolean winner, int plays, String[] name, String[][] table, String returnB, int counter ) {
		String option = "";
		boolean verification = false;
	
		do{
			option = JOptionPane.showInputDialog("Deseja jogar novamente"
					+ "\n (S) = SIM"
					+ "\n (N) = NÃO");
			
			if ((option.equals("S")) || (option.equals("N"))) {
				verification = true;
			}else{
				verification = false;
				JOptionPane.showMessageDialog(null, "OPÇÃO INCORRETA");
			}
			
		}while(verification==false);
		
		if (option.equals("S")) {
			winner = false;
			plays = 0;
			
			interFace(name);
			
			fillMatriz(table, counter);
			
			startPlay(table, returnB, counter, name);
			
			JOptionPane.showMessageDialog(null, snowBoard(table, returnB), "Tabela", JOptionPane.INFORMATION_MESSAGE);
		}else{
			System.exit(0);
		}
		
	}
	
	
}
