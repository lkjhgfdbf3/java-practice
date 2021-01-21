package day210122;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon10952a {
	public static void main(String[] args) throws IOException {
		InputStream inputstream = System.in;
		InputStreamReader isr = new InputStreamReader(inputstream);
		BufferedReader bfr = new BufferedReader(isr);
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(bfr.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			if(a==0 && b==0) {
				break;
			}
			sb.append((a+b)).append('\n');
			System.out.println(a+b);
		}
	}
}
