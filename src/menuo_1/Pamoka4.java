package menuo_1;

public class Pamoka4 {

	public static void main(String[] args) {

		// paprastas kintamasis
		int y = 5;
		
		// masyvas
		int[] x = new int[5]; // masyvo sukurimas. Ilgis 5
		// 0 1 2 3 4
		x[0] = 4;
		x[1] = 7;
		x[2] = x[0] * x[1];
		
		// ketvirtoji uzduotis.
		if ( (x[2] & 1) == 0 ) {
			x[3] = 0; // lyginis
		}else {
			x[3] = 1; // nelyginis
		}
		
		// Penktoji uzduotis
		x[4] = Math.max(x[0], x[1]);
		
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
	}

}
