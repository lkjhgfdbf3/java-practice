package day2;
import java.util.Scanner;

public class BackJoon24393 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		
		for(int i=0; i<=count; i++) {
			for(int j=0; j<=count-i; j++) {
			System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scanner.close();
	}
}
