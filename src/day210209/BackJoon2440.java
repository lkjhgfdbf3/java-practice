package day210209;
import java.io.*;

public class BackJoon2440 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=a; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
