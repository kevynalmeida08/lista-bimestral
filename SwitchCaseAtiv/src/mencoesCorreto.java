import java.util.Scanner;
public class mencoesCorreto {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	
	double  mb,b,r,i,porcentagem, total;
	String opcao;
	
	System.out.println("Insira a quantidade de alunos com a nota MB.");
	mb = ler.nextInt();
	
	System.out.println("Insira a quantidade de alunos com a nota B.");
	b = ler.nextInt();
	
	System.out.println("Insira a quantidade de alunos com a nota R.");
	r = ler.nextInt();
	
	System.out.println("Insira a quantidade de alunos com a nota I.");
	i = ler.nextInt();
	
	System.out.println("Qual das notas voc� quer verificar?");
	opcao = ler.next();
	
	total = mb+b+r+i;
	
	switch (opcao) {
	case "mb":
		porcentagem = (mb/100)*(total);
		System.out.println("A porcentagem de alunos com a nota MB �:" + porcentagem + "%");
		break;
	case "b":
		porcentagem = b/100*(total);
		System.out.println("A porcentagem de alunos com a nota B �:" + porcentagem + "%");
		break;
	case "r":
		porcentagem = r/100*(total);
		System.out.println("A porcentagem de alunos com a nota R �:" + porcentagem + "%");
		break;
	case "i":
		porcentagem = i/100*(total);
		System.out.println("A porcentagem de alunos com a nota I �:" + porcentagem + "%");
		break;
	default:
		System.out.println("Nota inv�lida, porfavor selecione entre MB, B, R ou I.");
	}
	ler.close();
	}
}
