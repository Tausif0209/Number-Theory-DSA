public class Leetcode2894 {
  public int differenceOfSums(int n, int m) {
        //O(n)
        // int ans=0;
        // for(int i=1;i<=n;i++) ans =ans + ((i%m==0)? -i:i);
        // return ans;

        //O(1)
        return (n*(n+1))/2 - m*(n/m)*((n/m)+1);
    }
  
}
