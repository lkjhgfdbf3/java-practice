package day210331;
import java.util.*;

public class BaekJoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int []a = new int[26];
		
		for(int i=0; i<26; i++) {
			a[i] = -1;
		}
		
		for(int i=0; i<str.length(); i++) {
			int c = str.charAt(i)-'a';
			if(a[c]==-1) {
				a[c]=i;
			}
		}
		for(int i=0; i<26; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
