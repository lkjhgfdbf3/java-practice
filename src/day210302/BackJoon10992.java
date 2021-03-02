package day210302;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackJoon10992 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int value = Integer.parseInt(bfr.readLine());
		
		for(int i=1; i<=value; i++) {
			for(int j=i; j<=value-1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++) {
				if(i==value) 
					System.out.print("*");
				else if(k==1)
					System.out.print("*");
				else if(k==i*2-1)  
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}