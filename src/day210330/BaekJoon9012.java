package day210330;
import java.io.*;
import java.util.*;

public class BaekJoon9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		while(a-- > 0) {
			System.out.println(isValid(br.readLine()));
		}
	}
	public static String isValid(String s) {
		int n = s.length();
		int cnt = 0;
		
		for(int i=0; i<n; i++) {
			if(s.charAt(i)=='(') {
				cnt+=1;
			}
			else {
				cnt-=1;
			}
			
			if(cnt<0) return "NO";
		}
		
		if(cnt==0) return "Yes";
		else return "NO";
	}
}
