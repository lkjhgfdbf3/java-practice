package day210208;
import java.io.*;

public class BackJoon8393 {
	public static void main(String[] args) throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bfr.readLine());
		int sum = 0;
		
		for(int i=1; i<=a; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
