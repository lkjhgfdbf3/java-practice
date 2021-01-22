package day210122;
import java.io.*;

public class BackJoon1110a {
	public static void main(String[] args) throws IOException {
		InputStream inputstream  = System.in;
		InputStreamReader isr = new InputStreamReader(inputstream);
		BufferedReader bfr = new BufferedReader(isr);
		
		int n = Integer.parseInt(bfr.readLine());
		
		int cnt = 0;
		int copy = n;
		
		do {
			n = ((n%10)*10)+(((n/10)+(n%10))%10);
			cnt += 1;
		}while(copy!=n);
		System.out.println(cnt);
	}
}
