import java.util.Scanner;
public class exercicio1 {
 public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	//VAriaveis 
	int i,aE,aN;
	
	//leitura
	System.out.println("Escreva o seu ano de nascimento.");
	aN = ler.nextInt();
	
	System.out.println("Escreva o ano da pr�xima elei��o.");
	aE = ler.nextInt();
	
	i = aE-aN;
	
	if (i>=16) {
		System.out.println("Voc� poder� votar na pr�xima elei��o.");
	}
		else {
		System.out.println("Voc� n�o poder� votar na pr�xima elei��o.");
	}
	ler.close();
 	}
}
