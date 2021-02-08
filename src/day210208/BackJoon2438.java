package day210208;
import java.io.*;

public class BackJoon2438 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
