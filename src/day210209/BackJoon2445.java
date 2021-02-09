package day210209;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon2445 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		int col=0;
		int space=2;
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=1; i<=a; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				for(int j=(i-1)*2; j<=(a-1)*2; j++) {
					System.out.print(" ");
				}
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
			System.out.println();
		}
		
		for(int i=a; i<2*a-1; i++) {
			for(int h=col; h<a-1; h++) {
				System.out.print("*");
			}
			for(int k=0; k<=space; k++) {
				System.out.print(" ");
			}
			for(int h=col; h<a-1; h++) {
				System.out.print("*");
			}
			col++;
			space+=2;
		System.out.println();
		}
	}
}