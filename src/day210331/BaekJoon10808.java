package day210331;
import java.util.*;

public class BaekJoon10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int []a = new int[25];
		
		for(char ch : str.toCharArray()) {
			a[(int)ch-'a']+=1;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
