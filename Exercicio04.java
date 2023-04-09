package listaDois;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//int A=0;
		int B=0;
		int i=0;
		int resultado=0;
		do {
			Scanner ler = new Scanner(System.in);
			System.out.println("digite um numero qualquer ou 0 para sair!!");
			B = ler.nextInt();
				if (B==0) {
					System.out.println("saiu");
				}
				 else { do {
					 resultado = B*i;
						System.out.println(B + " x " + i + " = " + resultado);
					    i++;
					    } while (B < 10);
						}
		}while(B!=0);
	}
}