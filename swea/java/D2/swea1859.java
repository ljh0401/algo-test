import java.util.Scanner;
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
            long[] S = new long[N];
            for (int i =0; i<N ; i++) {
                S[i] = sc.nextLong();
            }
            long sum = 0;
            long max = 0;
            for (int i =0; i<N ; i++) {
                max = S[i];
                int idx = i;
                for (int j = i; j < N; j++) {
                    if (S[j] > max) {
                        max = S[j];
                        idx = j;
                    } 
                }
                if (idx != i){
                for (int s = i; s <= idx; s++){
                     sum += max-S[s];
                    }
                    i = idx;
                }
            }
            System.out.println("#"+test_case+" "+sum);
        }
    }
}