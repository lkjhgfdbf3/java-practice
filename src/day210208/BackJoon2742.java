package day210208;
import java.io.*;

public class BackJoon2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(bfr.readLine());
		
		for(int i=a; i>=1; i--) {
			System.out.println(i);
		}
	}
}
