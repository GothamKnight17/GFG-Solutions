//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends




/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n) {
        for(int i=0; i<n; i++) {   
            int temp1 = a[i], temp2 =0;
            while(temp1!=0){ 
                int rem = temp1%10;
                temp2 = temp2*10 + rem;
                temp1/=10;
            }
            if(temp2!=a[i]){ 
                return 0;
            }
        }
        return 1;
    }
}