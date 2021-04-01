package day210401;
import java.io.*;
import java.util.*;

public class BaekJoon11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[]a = new String[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			 a[i]=str.substring(i);
		}
		
		Arrays.sort(a);
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(a[i]);
		}
	}
}
