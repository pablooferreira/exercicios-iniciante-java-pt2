//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

package exercicios_iniciante_pt2;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hi, hf, d;
		
		System.out.println("Digite a hora inicial: ");
		hi = sc.nextInt();
		System.out.println("Digite a hora final: ");
		hf = sc.nextInt();
		
		if (hi < hf) {
			d = hf - hi;
		}
		else {
			d = 24 - hi + hf;
		}
		
		System.out.println("A partida durou " + d + "Hrs");
		
		
		sc.close();

	}

}
