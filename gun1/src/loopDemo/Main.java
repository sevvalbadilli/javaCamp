package loopDemo;

public class Main {

	public static void main(String[] args) {
		// for

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		System.out.println("Döngü Bitti");

		// while

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;

		}
		
		System.out.println("Döngü Bitti");
		
		
		
		// Do - While
		
		int j = 1;
		do {
			System.out.println(j);
			j++;
			
		} while (j<10);
		
		System.out.println("do while Döngüsü Bitti");
	}
}
