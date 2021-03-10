package day210310;
import java.util.Scanner;

public class BackJoon14888 {
	public static int MAX=Integer.MIN_VALUE;
	public static int MIN=Integer.MAX_VALUE;
	public static int N;
	public static int[]number;
	public static int[]operator=new int[4];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		number = new int[N];
		
		for(int i=0; i<N; i++) {
			number[i]=sc.nextInt();
		}
		
		for(int j=0; j<4; j++) {
			operator[j]=sc.nextInt();
		}
		dfs(number[0],1);
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
	public static void dfs(int num, int idx) {
		if(idx==N) {
			MAX=Math.max(MAX, num);
			MIN=Math.min(MIN, num);
			return;
		}
		
		for(int k=0; k<=3; k++) {
			if(operator[k]>0) {
				operator[k]--;
				switch(k) {
				case 0: dfs(num+number[idx],idx+1); break;
				case 1: dfs(num-number[idx],idx+1); break;
				case 2: dfs(num*number[idx],idx+1); break;
				case 3: dfs(num/number[idx],idx+1); break;
				}
			}
		}
	}
}
