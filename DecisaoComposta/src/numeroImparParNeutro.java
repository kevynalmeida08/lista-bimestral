import java.util.Scanner;
public class numeroImparParNeutro {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//variaveis 
		double n;
		
		//leitura de dados
		System.out.println("Entre com o n�mero.");
		n = ler.nextDouble();
		
		//if else
		if (n<0) {
			System.out.println("O n�mero � negativo.");
		}else if (n==0) {
			System.out.println("O n�mero � neutro.");
		}else {
			System.out.println("O n�mero � positivo.");
		}
		ler.close();
	}
}
