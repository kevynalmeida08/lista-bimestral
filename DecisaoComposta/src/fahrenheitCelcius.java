import java.util.Scanner;
public class fahrenheitCelcius {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//variaveis
		double f,c;
		
		//leitura de dados
		System.out.println("Entre com a temperatura em fahrenheit.");
		f = ler.nextDouble();
		
		//convers�o
		c = (f-32)/1.8;
		System.out.println(c + "�C");
		
		//if else
		if (c<=15) {
			System.out.println("Est� frio");
		}else if (c<=22) {
			System.out.println("Est� ameno");
		}else {
			System.out.println("Est� calor.");
		}
		ler.close();
	}
}
