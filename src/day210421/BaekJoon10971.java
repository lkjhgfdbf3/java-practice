package day210421;

import java.util.*;

public class BaekJoon10971 {
	public static boolean mutation(int []a) {
		int i = a.length-1;
		while(i>0 && a[i-1]>=a[i]) {
			i-=1;
		}
		if(i<=0) {
			return false;
		}
		
		int j=a.length-1;
		while(a[j]<=a[i-1]) {
			j-=1;
		}
		int temp = a[i-1];
		a[i-1]=a[j];
		a[j]=temp;
		
		j = a.length-1;
		if(i<j) {
			temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i+=1;
			j-=1;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [][]w = new int[n+1][n+1];
		int a[] = new int[n];
		int ans = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			a[i]=i;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				w[i][j]=sc.nextInt();
			}
		}
		
		do {
			boolean ok = true;
			int sum=0;
			for(int i=0; i<n-1; i++) {
				if(w[a[i]][a[i+1]]==0) {
					ok=false;
				}
				else {
					sum+=w[a[i]][a[i+1]];
				}
			}
			if(ok && w[a[n-1]][a[0]]!=0) {
				sum+=w[a[n-1]][a[0]];
				if(ans>sum) {
					ans=sum;
				}
			}
		}while(mutation(a));
		System.out.println(ans);
	}
}
