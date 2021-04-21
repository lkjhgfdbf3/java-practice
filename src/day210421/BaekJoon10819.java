package day210421;
import java.util.*;

public class BaekJoon10819 {
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
	public static int calculate(int a[]) {
		int sum=0;
		for(int i=1; i<a.length; i++) {
			sum +=Math.abs(a[i]-a[i-1]);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[]= new int[n];
		int ans=0;
		int sum=0;
		
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		do {
			int temp = calculate(a);
			ans = Math.max(ans, temp);
		}while(mutation(a));
		System.out.println(ans);
	}
}
