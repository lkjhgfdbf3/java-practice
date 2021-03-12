package day210312;
import java.util.*;

public class BaekJoon3085 {
	static int check(char [][]arr) {
		int ans=1;
		for(int i=0; i<arr.length; i++) {
			int count=1;
			for(int j=1; j<arr.length; j++) {
				if(arr[i][j]==arr[i][j-1]) {
					count+=1;
				}
				else {
					count=1;
				}
				if(ans<count) {
					ans=count;
				}
			}
			count=1;
			for(int j=1; j<arr.length; j++) {
				if(arr[j][i]==arr[j-1][i]) {
					count+=1;
				}
				else {
					count=1;
				}
				if(ans<count) {
					ans=count;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char [][]arr = new char[N][N];
		int ans=0;
		
		for(int i=0; i<N; i++) {
			arr[i]=sc.next().toCharArray();
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(j+1<N) {
					char t = arr[i][j];
					arr[i][j]=arr[i][j+1];
					arr[i][j+1]=t;
					int temp=check(arr);
					if(ans<temp) {
						ans=temp;
					}
					t = arr[i][j];
					arr[i][j]=arr[i][j+1];
					arr[i][j+1]=t;
				}
				if(i+1<N) {
					char t = arr[i][j];
					arr[i][j]=arr[i+1][j];
					arr[i+1][j]=t;
					int temp=check(arr);
					if(ans<temp) {
						ans=temp;
					}
					t = arr[i][j];
					arr[i][j]=arr[i+1][j];
					arr[i+1][j]=t;
				}
			}
		}
		System.out.println(ans);
	}
}
