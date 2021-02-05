package day210205;
import java.io.*;

public class BackJoon11721 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String str = new String(bfr.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			sb.append(str.charAt(i));
			
			if(i%10==9) {
				sb.append('\n');
			}
		}
		System.out.println(sb);
	}
}
