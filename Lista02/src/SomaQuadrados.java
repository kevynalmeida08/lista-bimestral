import java.util.Scanner;
public class SomaQuadrados {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//Variaveis
		double n1, n2, n3, soma;
		
		System.out.println ("Saiba a soma de tr�s quadrados de tr�s n�meros!");
		
		//Leitura dos dados
		
	System.out.println ("Digite o primeiro n�mero.");
	n1 = ler.nextDouble();
	
	System.out.println ("Digite o segundo n�mero.");
	n2 = ler.nextDouble();
	
	System.out.println ("Digite o terceiro n�mero");
	n3 = ler.nextDouble();
	
	//Calculo dos quadrados
	soma = ( n1 * n1 ) + ( n2 * n2 ) + ( n3 * n3 );
	
	//Apresenta��o do resultado
	System.out.print ("A soma do quadrado dos tr�s n�meros �:" + soma);
	
	ler.close();
	}
}
