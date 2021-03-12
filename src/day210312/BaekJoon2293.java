package day210312;
import java.io.*;
import java.util.*;

public class BaekJoon2293 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int n, k;
    static int[] arr, dp;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        dp = new int[k + 1];
        dp[0] = 1;

        for(int i = 1 ; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            for (int j = arr[i]; j <= k; j++)
                dp[j] += dp[j - arr[i]];
        }

        System.out.println(dp[k]);
    }
}
