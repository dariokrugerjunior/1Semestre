package introducaoJava;

//importando a classe JOptionPane para usar o paineis de dialogo
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		boolean verification = false;
	
		int[] valores = new int[10];
		//Receber e guardar os 10 primeiros numeros	
			
			for(int i=0; i<10; i++) {
				valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° valor: "));
			}
			
			do {
			
			for(int i=0; i<10; i++) {
				
				if (valores[i]>0) {
					verification = true;
				}else{
					verification = false;
					valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor informado é negativo, Informe o "+(i+1)+"° valor correto,: "));
					
					break;
				}
				
			}
		}while(verification==false);
	
	
		//criando variavel para armazenar se o usuario deseja encerrar o programa
		String repetir;
		//inicio da estrutura de repetição para o menu 
		do {
			//solicitando opcao do menu
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Oque você deseja ver ?"
					+ "\n 1 - Todos os valores"
					+ "\n 2 - Somente o primeiro valor"
					+ "\n 3 - Somente o ultimo valor"
					+ "\n 4 - Ver os valores pares"
					+ "\n 5 - Numero maior"));
		
			//programação do menu 
			switch (opcao) {
				//mostrando todos os valores
				case 1:
					for (int i=0; i<10; i++) {
						JOptionPane.showMessageDialog(null, valores[i], "Valor "+(i+1), JOptionPane.INFORMATION_MESSAGE);
					}
					break;
					//mostrando somente o primeiro valor 
				case 2:
					JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor", JOptionPane.INFORMATION_MESSAGE);
					break;
					//mostrando somenete o ultimo valor
				case 3:
					JOptionPane.showMessageDialog(null, valores[9], "O ultimo valor", JOptionPane.INFORMATION_MESSAGE);
					break;
					//mostrando somente os valores pares 
				case 4:
					String valoresPares = "";
					for (int i=0; i<10; i++) {
						if (valores[i]%2==0) {
							if (valoresPares!="") {
								valoresPares += ", ";
							}
							valoresPares += valores[i];
						}
					}
					JOptionPane.showMessageDialog(null, valoresPares, "Valores Pares ", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case 5:
					//mostra o valor maior dos vetores
					int highValue = 0;
					for (int i=0; i<10; i++) {
						if (valores[i] > highValue) {
							highValue = valores[i];
						}
					}
					JOptionPane.showMessageDialog(null, highValue, "É o maior valor", JOptionPane.INFORMATION_MESSAGE);
					break;					
					//caso a opcao seja invalida
					default:
						JOptionPane.showMessageDialog(null, "Opção invalida", "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			
			//solicitando se usuario deseja voltar ao menu
			repetir = JOptionPane.showInputDialog("Deseja voltar ao menu ?"
					 + "\n Digite S para sim ou outro caractere para encerrar:");
			//fim da estrutura de repetição para o menu 
			
		}while (repetir.equals("s") || repetir.equals("S")); 
	}
}























		
		
