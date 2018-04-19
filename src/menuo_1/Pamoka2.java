package menuo_1;

import java.util.Random;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Pamoka2 {

	public static void main(String[] args) {

		// kintamieji
		Random ran = new Random();
		Scanner input = new Scanner(System.in);
		int monsterHP;
		int playerDMG = 12;
		int tempHP = ran.nextInt(5);
		monsterHP = 10 + tempHP;
		String ats;
		boolean isPlayerDead = false;
		
		// pirmas roundas
		System.out.println("Monster HP: " + monsterHP);
		System.out.println("Player DMG: " + playerDMG);
		System.out.println("Choose action: attack | defend");
		ats = input.next();
		if (ats.equalsIgnoreCase("attack")) {
			monsterHP -= playerDMG;
			if (monsterHP > 0) {
				isPlayerDead = true;
			}
		}
		
		if (ats.equalsIgnoreCase("defend")) {
			int temp = ran.nextInt(5);
			playerDMG = 10 + temp;
			System.out.println("New DMG: " + playerDMG);
		}
		
		if (monsterHP > 0) {
			System.out.println("Monster HP: " + monsterHP);
			if (isPlayerDead) {
				System.out.println("player is dead");
			}
		} else {
			System.out.println("Monster is dead");
		}
		
	}
}
