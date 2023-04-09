package listaDois;
import java.util.Scanner;


public class Exercicio02 {

	public static void main(String[] args) {
		int A=0;
		int soma=0;
		do {
			Scanner ler = new Scanner(System.in);
			System.out.println("Informe o valor de A :");
			A = ler.nextInt();
			soma=soma+A;
			System.out.println("ultimo numero digitado foi " + A);
			System.out.println("soma dos numeros digitados: " + soma);
		}
		while(A>=0);
	}

}
