	import java.util.Scanner;
public class rodizioDeCarro {
	public static void main(String[] args) {

		Scanner ler = new Scanner (System.in);
		int P;
		
		System.out.println("Escreva o ultimo n�mero da placa do seu carro:");
		
		P = ler.nextInt();
		
		switch(P) {
		case 1:
		case 2:
			System.out.println("Ele n�o pode circular na segunda");
			break;
		case 3:
		case 4:
			System.out.println("Ele n�o pode circular na ter�a");
			break;
		case 5:
		case 6:
			System.out.println("Ele n�o pode circular na quarta");
			break;
		case 7:
		case 8:
			System.out.println("Ele n�o pode circular na quinta");
			break;
		case 9:
		case 0:
			System.out.println("Ele n�o pode circular na sexta");
			break;
			default:
				System.out.println("N�mero inv�lido");
		}
		ler.close();
	}
}

