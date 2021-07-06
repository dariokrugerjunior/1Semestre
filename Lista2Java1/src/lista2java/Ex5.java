package lista2java;

import javax.swing.JOptionPane;

class Ex5 {

	public static void main(String[] args) {
		
		int user = 0;
		int ageUser = 0;
		int ageUserTotal = 0;
		double wageUser = 0;
		double wageUserTotal =0;
		int frequency = 0;
		String repeat;
		int userFrequency = 0;
		String smoker;
		int userSmoker = 0;
		boolean verification = false;
		
		
		do {
			
		ageUser = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do usuario"));
		ageUserTotal = ageUser + ageUserTotal;
		user = user +1;
		do {
			
				smoker = JOptionPane.showInputDialog("O usuario é fumante ?"
				+ "\n Digite SIM ou NÃO");
				
				if (smoker.equals("SIM") == true){
					verification = true;
					userSmoker = userSmoker +1;
				}else if (smoker.equals("NÃO") == true) {
					verification = true;
				}else {
					verification = false;
					JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}while(verification == false);
		
		
		wageUser = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salario liquido"));
		
		wageUserTotal = wageUser + wageUserTotal;
		
		frequency = Integer.parseInt(JOptionPane.showInputDialog("Informe quanto tempo o usuario frequenta o clube em meses"));
		
		if (frequency >= 3) {
			userFrequency = userFrequency +1;
		}
		
		
		do {
		repeat = JOptionPane.showInputDialog("Tem mais alguêm para cadastar ?"
				 + "\n Digite SIM para sim ou ENCERRAR para encerrar:");
		
			if (repeat.equals("SIM") == true){
			verification = true;
			
			}else if (repeat.equals("ENCERRAR") == true) {
			verification = true;
			}else {
			verification = false;
			JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		
	}while(verification == false);

		
		}while (repeat.equals("SIM"));
		
		ageUserTotal = ageUserTotal / user;
		wageUserTotal = wageUserTotal / user;
		userFrequency = userFrequency*100/user;
				
		JOptionPane.showMessageDialog(null, "A média de idades das pessoas que frequetam o clube: "+ageUserTotal+" Anos", "Idade", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "A média de salario das pessoas que frequetam o clube: "+wageUserTotal+"", "Salario", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Numero de pessoas que são fumantes no clube: "+userSmoker+"", "Fumante", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "A porcentagem de pessoas que frequentam o clube há mais de 3 meses: "+userFrequency+"%", "Frequencia", JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}
}
