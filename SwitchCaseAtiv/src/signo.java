import java.util.Scanner;
public class signo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dia, mes;
		
		System.out.println("Digite o dia do seu nascimento.");
		dia = ler.nextInt();
		
		System.out.println("Digite o m�s do seu nascimento.");
		mes = ler.nextInt();
		
		switch (mes) {
		case 1:
			if (dia <= 19)
				System.out.println("Seu signo � de Capricornio.");
			else 
				System.out.println("Seu signo � de Aqu�rio");
			break;
		case 2:
			if (dia <= 18)
				System.out.println("Seu signo � de Aqu�rio.");
			else 
				System.out.println("Seu signo � de Peixe.");
			break;
		case 3:
			if (dia <= 20)
				System.out.println("Seu signo � de Peixe.");
			else 
				System.out.println("Seu signo � de Aries.");
			break;
		case 4:if (dia <= 19)
			System.out.println("Seu signo � de Aries.");
		else 
			System.out.println("Seu signo � de Touro.");
		break;
		case 5:if (dia <= 20)
			System.out.println("Seu signo � de Touro.");
		else 
			System.out.println("Seu signo � de G�meos.");
		break;
		case 6:if (dia <= 20)
			System.out.println("Seu signo � de G�meos.");
		else 
			System.out.println("Seu signo � de C�ncer.");
		break;
		case 7:if (dia <= 22)
			System.out.println("Seu signo � de C�ncer.");
		else 
			System.out.println("Seu signo � de Le�o.");
		break;
		case 8:if (dia <= 22)
			System.out.println("Seu signo � de Le�o.");
		else 
			System.out.println("Seu signo � de Virgem.");
		break;
		case 9:if (dia <= 22)
			System.out.println("Seu signo � de Virgem.");
		else 
			System.out.println("Seu signo � de Libra.");
		break;
		case 10:if (dia <= 22)
			System.out.println("Seu signo � de Libra.");
		else 
			System.out.println("Seu signo � de Escorpi�o.");
		break;
		case 11:if (dia <= 21)
			System.out.println("Seu signo � de Escorpi�o.");
		else 
			System.out.println("Seu signo � de Sagit�rio.");
		break;
		case 12:if (dia <= 21)
			System.out.println("Seu signo � de Sagit�rio.");
		else 
			System.out.println("Seu signo � de Capricornio.");
		break;
		default:
			System.out.println("M�s inv�lido.");
		}
		ler.close();
	}
}
