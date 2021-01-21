import java.util.Scanner;

public class BackJoon11022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		for(int i=0; i<=count; i++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			System.out.println("Case #"+i+":"+A+"+"+B+"="+(A+B));
		}
		
	}
}
