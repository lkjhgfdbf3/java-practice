package day210204;
import java.io.*;
import java.util.StringTokenizer;

public class BackJoon10950 {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(bfr.readLine());
		StringBuilder sb= new StringBuilder();
		
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(bfr.readLine()," ");
			sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
