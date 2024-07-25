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
            String[][] farm = new String[N][N];
            for (int i = 0; i < N ; i++ ) {
                    farm[i] = sc.next().split("");
                  }
            int sum = 0;
             for (int j = 0; j <= N/2; j++) {
                  for (int i = j; i < N-j ; i++ ){
                    sum += Integer.parseInt(farm[N/2-j][i]);
                    if (j != 0) sum += Integer.parseInt(farm[N/2+j][i]);
                  }
            }
            System.out.println("#"+test_case+" "+sum);
        }
    }
}