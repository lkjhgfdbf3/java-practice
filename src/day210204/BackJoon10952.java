package day210204;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon10952 {
	public static void main(String[]args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		StringTokenizer st;
		while(true) {
			st = new StringTokenizer(bfr.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) break;
			
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
	}
}