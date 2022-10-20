//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não

package exercicios_iniciante_pt2;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n;
	
	System.out.println("Digite o número: ");
	n = sc.nextInt();
	
	if (n < 0) {
		System.out.println("O número é negativo");
	}
	else
		System.out.println("O número é positivo");
	
	sc.close();

	}

}
