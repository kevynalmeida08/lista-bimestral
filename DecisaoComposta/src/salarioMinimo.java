import java.util.Scanner;
public class salarioMinimo {
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
	//variaveis
	int s;
	
	//leitura de dados
	System.out.println("Entre com o valor do seu sal�rio.");
	s = ler.nextInt();
	
	
	//salario minimo, igual ou maior.
	if (s<1302) {
		System.out.println("Seu sal�rio est� abaixo de um sal�rio minimo.");
		}else if (s==1302) {
		System.out.println("Seu sal�rio equivale a um sal�rio minimo.");
		}else {
		System.out.println("Seu sal�rio est� acima de um sal�rio minimo.");
		}
	ler.close();
	}
}
