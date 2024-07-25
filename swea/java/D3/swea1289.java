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
            String[] B_n = sc.next().split("");
            int ans = 0;
            boolean find = false;
            for (int i = 0; i < B_n.length; i++) {
                if (!find && B_n[i].equals("1")) {
                    ans++;
                    find = true;
                }
                if (find && B_n[i].equals("0")) {
                    ans++;
                    find = false;
                }
            }
            System.out.println("#"+test_case+" "+ans);
             
        }
    }
}