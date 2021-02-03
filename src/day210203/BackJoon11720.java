package day210203;
import java.io.*;

public class BackJoon11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		
		bfr.readLine();
		
		for(int value : bfr.readLine().getBytes()) {
			sum += (value - '0');
		}
		System.out.println(sum);
	}
}
