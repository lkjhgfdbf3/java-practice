package day210208;
import java.io.*;

public class BackJoon2739 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=1; i<=9; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
	}
}
