import java.util.Scanner;
public class exercicio2 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int R, N;
		//leia(N);
		System.out.println("Digite o n�mero");
		N = ler.nextInt();
		R=N%2;
		if (R==0) {
			System.out.println("Ele � par");
		}
		else {
			System.out.println("Ele � �mpar");
		}
		ler.close();
	}
}
