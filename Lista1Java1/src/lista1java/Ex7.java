package lista1java;

import javax.swing.JOptionPane;

class Ex7 {

	public static void main(String[] args) {
		
		boolean verification = false;
		int j = 0;
		int []values = new int[10];
				
        for (int i = 0; i < 10; i++) {
            
        	values[i] = (int)Math.round(Math.random() * 10);
        	System.out.println(values[i]);
        }
		
        
        
        int userValues = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero para ser localizado na poci��o de 0 a 10: "));
		
		
        for (int i = 0; i < 10; i++) {
        	
        	if (values[i] == userValues) {
        		j =  i;
        		verification = true;
        	}
        }
        
        if (verification==true) {
        	JOptionPane.showMessageDialog(null, "O numero informado "+userValues+" esta na posi��o "+(j+1)+"", "Posi��o", JOptionPane.INFORMATION_MESSAGE);
        }else{
        	JOptionPane.showMessageDialog(null, "Esse numero n�o foi localizado em nenhuma posi��o", "Posi��o", JOptionPane.INFORMATION_MESSAGE);
        }
        
	}
}
