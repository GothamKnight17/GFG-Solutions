//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends

class Solution {
    boolean fascinating(long n) {
        // code here
        int[] ans = new int[10];
        long x1 = n*2, x2 = n*3;
        while(x1!=0){ 
            int x = (int)(x1%10);
            ans[x]++;
            if(ans[x]>1)
               return false;
            x1/=10;
        }
        while(x2!=0){ 
            int x = (int)(x2%10);
            ans[x]++;
            if(ans[x]>1)
               return false;
            x2/=10;
        }
        while(n!=0){ 
            int x = (int)(n%10);
            ans[x]++;
            if(ans[x]>1)
               return false;
            n/=10;
        }
        for(int i=1; i<=9; i++){ 
            if(ans[i]!=1){ 
                return false;
            }
        }
        return true;
    }
}