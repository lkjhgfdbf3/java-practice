package day210204;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon19053 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(bfr.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<a; i++) {
			st = new StringTokenizer(bfr.readLine(),",");
			sb.append((st.nextToken())+(st.nextToken()));
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
