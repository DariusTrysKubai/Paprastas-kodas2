package menuo_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	// 2018 - 03 - 15
	public static void main(String[] args) {
		
		// 1
		int x = 4;
		int y = 6;
		if (x == y) {
			System.out.println("lygu");
		} else {
			System.out.println("nelygu");
		}

		// 2

		Random ran = new Random();
		double a = ran.nextInt(100);
		double count = 0;
		double count_temp = 0;
		double avg = 0;

		while (true) {
			
			while (a != 50) {
				count_temp++;
				a = ran.nextInt(100);
			}
			
			if (a == 50) {
				avg = ((avg * count) + count_temp) / count;
				a = ran.nextInt(100);
				count_temp = 0;
			}
			count++;
			System.out.println("Avg: " + avg);
		}
		
		

	}

}
