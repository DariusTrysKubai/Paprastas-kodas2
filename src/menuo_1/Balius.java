package menuo_1;

import java.util.Scanner;

public class Balius {

	public static void main(String[] args) {
		
		// kintamieji
		boolean arSavaitgalis = false;
		String atsakymas;
		
		// sprendimas
		Scanner input = new Scanner(System.in);
		atsakymas = input.nextLine();
		if(atsakymas.equals("taip")) {
			arSavaitgalis = true;
		}else {
			arSavaitgalis = false;
		}
		
		if(arSavaitgalis) {
			// kas jeigu savaitgalis
		}else {
			// kas jeigu darbo diena
		}

	}

}
