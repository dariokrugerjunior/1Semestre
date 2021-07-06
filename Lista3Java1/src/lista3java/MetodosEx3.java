package lista3java;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

class MetodosEx3 {

	public static void main(String[] args) {
		double totalPurchase = 0;
				
		totalPurchase = purchase();
		
		discount(totalPurchase);
		
		
	}
	
	
	public static double purchase () {
		double totalPurchase = 0;

		totalPurchase = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total da compra"));	
		
		
		return totalPurchase;
	}
	
	public static void discount (double totalPurchase) {
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2); 
		
		if (totalPurchase <= 100) {
			JOptionPane.showMessageDialog(null, "O valor não tem desconto, total a pagar R$:"+df.format(totalPurchase));
		}else if (totalPurchase >= 100.01 && totalPurchase <= 200) {
			double discountPurchase = totalPurchase*20/100;
			totalPurchase = totalPurchase - discountPurchase;
			
			JOptionPane.showMessageDialog(null, "O valor tem desconto de 20%, total a pagar R$:"+df.format(totalPurchase));
		}else{
			double discountPurchase = totalPurchase*40/100;
			totalPurchase = totalPurchase - discountPurchase;
			
			
			JOptionPane.showMessageDialog(null, "O valor tem desconto de 40%, total a pagar R$:"+df.format(totalPurchase));
		}
	}

}
