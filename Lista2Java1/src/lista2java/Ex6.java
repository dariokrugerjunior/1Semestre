package lista2java;

import javax.swing.JOptionPane;

class Ex6 {

	public static void main(String[] args) {
		
		int []sales = new int[12];
		int biggerSales = 0;
		int totalSales = 0;
		int pairMonth = 0;
		int semester02 = 0;
		
		
		for (int i=0; i<12; i++) {
		sales[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de vendas no "+(i+1)+"° mês: "));
		totalSales = totalSales + sales[i];
		}
		
		int smallerSales = sales[1];
		
		for (int i=0; i<12; i++) {
			if (i%2==0) {	
				pairMonth = sales[i] + pairMonth;
			}
			
			if(i>=6){
				semester02 = semester02 + sales[i];
			}
			if (sales[i] > biggerSales) {
			biggerSales = sales[i];
			}
			
			if(sales[i] < smallerSales){
			smallerSales = sales[i];
			}
		}
		totalSales = totalSales/12;
		pairMonth = pairMonth/6;
		semester02 =  semester02/6;
		
		JOptionPane.showMessageDialog(null, "O mes com a maior venda: "+biggerSales+"", "MAIOR VENDA", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "O mes com a menor venda: "+smallerSales+"", "MENOR VENDA", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "A média das vendas no ano: "+totalSales+"", "ANO TODO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "A média das vendas nos meses pares: "+pairMonth+"", "MESES PARES", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "A média das vendas do 02 semestre: "+semester02+"", "2 SEMESTRE", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
