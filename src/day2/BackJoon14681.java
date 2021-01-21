package day2;
import java.util.Scanner;

public class BackJoon14681 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		if(A>0 && B>0) {
			System.out.println("Quadrant 1");
		}
		else if(A<0 && B>0) {
			System.out.println("Quadrant 2");
		}
		else if(A<0 && B<0) {
			System.out.println("Quadrant 3");
		}
		else {
			System.out.println("Quadrant 4");
		}
	}
}
