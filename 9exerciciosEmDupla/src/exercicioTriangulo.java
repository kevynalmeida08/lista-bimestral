import java.util.Scanner;
public class exercicioTriangulo {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
		
		//variaveis
		double a,b,c;
		
		//leitura de dados
		System.out.println("Insira o valor de A.");
		a = ler.nextDouble();
		
		System.out.println("Insira o valor de B.");
		b = ler.nextDouble();
		
		System.out.println("Insira o valor de C.");
		c = ler.nextDouble();
		
		//Tomada de decis�es 
		if (a+b>c & a+c>b & b+c>a) {
			
			if (a==b & a==c & b==c) {
			System.out.println("Tri�ngulo equil�tero");
			
			} else if (a!=b && a!=c && b!=c) {
				System.out.println("Tri�ngulo escaleno");
			} else {
				System.out.println("Triangulo Is�celes");
			}
		}else {
			System.out.println("N�o � um tri�gulo.");
		}
		ler.close();
	}
}
