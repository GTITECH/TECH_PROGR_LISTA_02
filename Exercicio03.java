package listaDois;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		int A=13;
		int B=0;
		do {
			Scanner ler = new Scanner(System.in);
			System.out.println("advinhe o numero :");
			B = ler.nextInt();
				if (B==A) {
					System.out.println("bingo!!");
				} else if (B<A) {
					System.out.println("numero secreto e maior");
				} else {
					System.out.println("numero secreto e menor");
				}
		}while(B!=A);
	}
}