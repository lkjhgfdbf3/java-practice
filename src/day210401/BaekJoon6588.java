package day210401;
import java.util.*;

public class BaekJoon6588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean []check = new boolean[101];
		StringBuilder sb = new StringBuilder();
		check[0]=check[1]=true;
		int max=0;
		
		while(true) {
			int a = sc.nextInt();
			if(a==0) break;
			
			for(int i=2; i*i<100; i++) {
				if(check[i]==true)
					continue;
				for(int j=i*2; j<=100; j+=i) {
					check[j]=true;
				}
				for(int k=2; k<=100; k++) {
					if(k%2==0)
						check[k]=true;
				}
			}
			
			for(int i=3; i<=100; i++) {
				if(check[i]==false) {
					for(int j=3; j<=100; j++) {
						if(check[j]==false) {
							if(a==(i+j)) {
								if(max<j-i) {
									max=j-i;
									System.out.println(a+" "+"="+" "+i+" "+"+"+" "+j);
									break;
								}
							}
						}
					}
				}
			}	
		}
	}
}
