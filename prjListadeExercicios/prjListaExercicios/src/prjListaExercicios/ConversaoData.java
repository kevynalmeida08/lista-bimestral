package prjListaExercicios;
import java.util.Scanner;
public class ConversaoData {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double dia, mes, ano;
		
		System.out.println("Digite o dia:");
		dia = ler.nextDouble();

		mes=dia/30;
		ano=dia/365;
		
		System.out.println("Convers�o para m�s:" +mes);
		
		System.out.println("Convers�o para ano:" +ano);
		
		ler.close();
	}

}
