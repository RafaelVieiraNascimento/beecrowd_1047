package program;

/*
beecrowd | 1047 - Tempo de Jogo com Minutos

Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H1 = sc.nextInt();
		int M1 = sc.nextInt();
		int H2 = sc.nextInt();
		int M2 = sc.nextInt();

		int horas = H2 - H1;
		int minutos = M2 - M1;

		if (H2 < H1 || H1 == H2 && M1 > M2 || H1 == H2 && H2 == M1 & M1 == M2)
			horas += 24;

		if (M2 < M1) {
			minutos += 60;
			horas -= 1;
		}

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
		sc.close();
	}
}
