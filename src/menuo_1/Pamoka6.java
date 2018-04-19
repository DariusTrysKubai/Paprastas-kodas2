package menuo_1;

import java.util.Scanner;

public class Pamoka6 {

	public static void main(String[] args) {

		/*
		 * Random ran = new Random(); int[] m = new int[10]; // sukurimas for (int i =
		 * 0; i < m.length; i++) { m[i] = ran.nextInt(10); } // spausdinimas for (int i
		 * = 0; i < m.length; i++) { System.out.println("Cell " + i + " = " + m[i]); }
		 */

		int[] m = new int[5];
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.println("Iveskite " + (i+1) + " reiksme");
			m[i] = input.nextInt();
		}
		

		for (int i = 0; i < 5; i++) {
			System.out.println("Lasteles " + i + " reiksme yra " + m[i]);
		}

	}

}
