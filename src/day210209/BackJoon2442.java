package day210209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2442 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=0; i<a; i++) {
			for(int j=0; j<=a-i-2; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
