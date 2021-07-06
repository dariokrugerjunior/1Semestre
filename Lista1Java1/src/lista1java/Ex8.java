package lista1java;

import javax.swing.JOptionPane;

class Ex8 {

	public static void main(String[] args) {
		
		int matriz[][] = new int [6][4];
		int monthSales[] = new int[6];
		int totalSales = 0;
		String totalMeses ="";
		
		for (int i=0; i<6; i++) {
			for (int j=0; j<4; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe as vendas do "+(i+1)+"° mes na "+(j+1)+"° semana"));
			
				monthSales[i] = matriz[i][j] + monthSales[i];
			}
		}
		
		for (int i=0; i<6; i++) {
			for (int j=0; j<4; j++) {
				totalSales = matriz[i][j] + totalSales;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A venda total nesses 6 meses foi de "+totalSales+"", "Venda Total", JOptionPane.INFORMATION_MESSAGE);
		
		for (int i=0; i<6; i++) {
		totalMeses += (i+1)+"º mes =" +monthSales[i]
				+ "\n ";
		}
		
		
		JOptionPane.showMessageDialog(null, totalMeses, "Vendas no mes", JOptionPane.INFORMATION_MESSAGE);
	}

}
