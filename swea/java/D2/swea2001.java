import java.util.Scanner;
import java.io.FileInputStream;
 
class Solution
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int N = sc.nextInt();
            int M = sc. nextInt();
            int[][] NN = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j= 0; j < N; j++) NN[i][j] = sc.nextInt();
            }
            int max = 0;
            for (int i = 0; i <= N-M; i++) {
                for (int j = 0; j <= N-M; j++) {
                    int tmp = 0;
                    for (int s =0; s < M; s++) {
                        for (int t = 0; t < M; t++) {
                            tmp += NN[i+s][j+t];
                        }
                    }
                    if (max < tmp) max = tmp;
                }
            }
            System.out.println("#"+test_case+" "+max);
        }
    }
}