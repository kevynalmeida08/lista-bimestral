package prjListaExercicios;
import java.util.Scanner;
public class SalarioDependente {
	public static void main (String Args[]) {
		Scanner ler = new Scanner(System.in);
		double salario, dependente, valor;
		
		System.out.println("Digite o valor do sal�rio:");
		salario = ler.nextDouble();
		
		System.out.println("Digite o n�mero de depentes:");
		dependente = ler.nextDouble();
		
		valor=55*dependente+salario;
		
		System.out.println("Seu sal�rio final:" +valor);
		
		ler.close();
	}
	

}