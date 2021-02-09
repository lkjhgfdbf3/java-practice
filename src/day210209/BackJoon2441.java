package day210209;
import java.io.*;

public class BackJoon2441 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=1; i<=a; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=a+1-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
