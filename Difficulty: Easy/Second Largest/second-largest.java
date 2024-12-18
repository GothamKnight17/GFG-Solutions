//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for(int i: arr){ 
            if(i>max1){ 
                max2 = max1;
                max1 = i;
            }else if(i<max1 && i>max2){
                max2 = i;
            }
        }
        return max2==Integer.MIN_VALUE?-1:max2;
    }
}