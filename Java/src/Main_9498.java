import java.util.*;

public class Main_9498 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int intScan = scan.nextInt();

		if (intScan >= 90 && intScan < 100) {
			System.out.println("A");
		} else if (intScan >= 80) {
			System.out.println("B");
		} else if (intScan >= 70) {
			System.out.println("C");
		} else if (intScan >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
}
