import java.util.Scanner;
public class conversao {
public static void main (String args []) {
	Scanner ler = new Scanner(System.in);
	
	//Variaveis 
	double e, c, eR;
	
	//leitura de dados
	System.out.println ("Digite o valor em euros.");
	e = ler.nextDouble();
	
	System.out.println ("Digite a cota��o atual.");
	c = ler.nextDouble();
	
	//calculo
	eR = e/c;
	
	//apresenta��o
	System.out.println ("O valor da convers�o em reais �:" + "R$" + eR);
	
		ler.close();
	}
}

