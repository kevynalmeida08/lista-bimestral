import java.util.Scanner;
public class numeroPrimo {
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int np, Cd = 0, div = 2, r;

	       
	        System.out.print("Digite um n�mero: ");
	        
	       
	        while (div < np) {
	        	r = np % div;
	            if (r == 0) { 
	            Cd++;
	            }
	            div++;
	        } 
	        if (np <= 1) {
	            System.out.println("Esse n�mero n�o � primo");
	        } else if (Cd == 0) {
	            System.out.println("Esse n�mero � primo");
	        } else {
	            System.out.println("Esse n�mero n�o � primo");
	        }

	        ler.close();
	    }
	}


