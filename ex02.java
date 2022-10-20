package exercicios_iniciante_pt2;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite o número: ");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("O Número é par");
		}
		else {
			System.out.println("O número é impar");
		}
		
		
		sc.close();

	}

}
