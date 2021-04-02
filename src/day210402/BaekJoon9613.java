package day210402;
import java.io.*;
import java.util.*;

public class BaekJoon9613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String []temp = br.readLine().split(" ");
		int []n = new int[temp.length];
		int count = 0;
		
		while(t-- > 0) {
			n[0] = Integer.parseInt(temp[0]);
			for(int i=1; i<=n[1]; i++) {
				n[i] = Integer.parseInt(temp[i]);
			}
			
			for(int k=1; k<=n[1]-1; k++) {
				for(int j=k+1; j<=n[1]; j++) {
					count +=gcd(n[k],n[j]);
				}
			}	
			System.out.println(count);
		}
		
	}
	
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
}
