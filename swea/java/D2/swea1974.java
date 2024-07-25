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
            int [][] SD = new int [9][9];
            int ans = 1;
            for (int i = 0 ; i < 9 ; i ++) {
                int[] find = new int[10];
                for (int j = 0; j < 9; j++) {
                    SD[i][j] = sc.nextInt();
                    find[SD[i][j]]++;
                }
                for (int j = 1; j < 10; j++) {
                if (find[j] == 0) ans = 0;
                }
            }
            for (int i = 0 ; i < 9 ; i ++) {
                int[] find = new int[10];
                for (int j = 0; j < 9; j++) {
                    find[SD[j][i]]++;
                }
                for (int j = 1; j < 10; j++) {
                if (find[j] == 0) ans = 0;
                }
            }
            int[] rr = {0, 1, 2, 0, 1, 2, 0, 1, 2};
            int[] cc = {0, 0, 0, 1, 1, 1, 2, 2, 2}; 
            for (int j = 0; j < 3; j++) {
                for (int s = 0; s <3; s++) {
                    int[] find = new int[10];
                    for (int t = 0; t<9; t++) {
                    find [SD[3*j+rr[t]][3*s+cc[t]]] ++;
                    }
                    for (int i = 1; i < 10; i++) {
                        if (find[i] == 0) ans = 0;
                    }
                }
            }
            System.out.println("#"+test_case+" "+ans);
        }
    }
}