package day210122;
import java.util.Scanner;

public class BackJoon1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int a = scanner.nextInt();
		if(a<10) a*=10;
		
		int []s = new int[2];
		s[0]= a/10;
		s[1]= (a-((a/10)*10));
		int k = s[0]+s[1];
		count+=1;
		
		while(true) {
			int []m = new int[2];
			m[0]= k/10;
			m[1]= (k-((k/10)*10));
			k = s[1]*10+m[1];
			
			if(k==a) {
				System.out.println(count);
				break;
			}
			k = s[1]+m[1];
			s[1] = m[1];
			count+=1;
		}
		scanner.close();
	}
}
