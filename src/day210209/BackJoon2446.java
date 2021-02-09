package day210209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2446 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=0; i<a; i++) {
				for(int j=0; j<i; j++) {
					System.out.print(" ");
				}
				for(int j=(i*2); j<a*2-1; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		for(int i=0; i<a-1; i++) {
			for(int h=1; h<(a-1)-i; h++) {
				System.out.print(" ");
			}
			for(int k=0; k<3+2*i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}