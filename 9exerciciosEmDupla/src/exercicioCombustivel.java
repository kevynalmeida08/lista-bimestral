import java.util.Scanner;
public class exercicioCombustivel {
	public static void main (String args []) {
		Scanner ler = new Scanner (System.in);
	
		//variaveis
		double dp, ct, gm;
		
		//leitura de dados
		System.out.println ("Digite a dist�ncia percorrida em quil�metros.");
		dp = ler.nextDouble();
		
		System.out.println("Digite a capacidade de combustivel do ve�culo em litros.");
		ct = ler.nextDouble();
		
		//calculo
		gm = dp / ct;
		
		//tomada de decis�o
		if (gm>=10) {
			System.out.println("O ve�culo � econ�mico.");
		}else {
			System.out.println("O ve�culo n�o � econ�mico.");
		}
		ler.close();
	}
}
