import java.util.ArrayList;

class Solution {
    public int[] closestPrimes(int left, int right) {
       int n=(int)Math.sqrt(right);
        boolean[] composite=new boolean[right-left+1];
        int i,j,minFactor;
        if(left==1) composite[0]=true;
        for(i=2;i<=n;i++){
            if(i>=left && composite[i-left]) continue;
            int maxFactor= right/i;
            if(left<=i) minFactor=2;
            else if(left%i==0) minFactor=left/i;
            else minFactor=left/i+1;
            for(j=minFactor;j<=maxFactor;j++){
                composite[i*j-left]=true;
            }
        }
        int[] ans =new int[]{left,right};
        ArrayList<Integer> primes=new ArrayList<>();
        for(i=left;i<=right;i++){
            if(!composite[i-left])  primes.add(i);
        }
        if(primes.size()<2) return new int[]{-1,-1};
        int prev=-1;
        for(Integer el:primes){
            if(prev!=-1 && el-prev< ans[1]-ans[0]){
                ans[0]=prev;
                ans[1]=el;
            }
            prev=el;
        }
        return ans;
    }
}