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
            int M = N;
            if (M%2 == 1) M+=1;
            String[] uCard = new String [M/2];
            String[] dCard = new String [N-M/2];
            for (int i = 0; i < M/2 ; i++) {
                uCard[i] = sc.next();
            }
            for (int i = 0 ; i < N-M/2; i++) {
                dCard[i] = sc.next();
            }
            System.out.print("#"+test_case+" ");
            for  (int i = 0; i < M/2; i++) {
                System.out.print(uCard[i]+" ");
                if (i < dCard.length) System.out.print(dCard[i]+" ");
            }
            System.out.println();
             
        }
    }
}