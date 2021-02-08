package day210208;
import java.io.*;

public class BackJoon2439 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bfr.readLine());
		bfr.close();
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<=a-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
