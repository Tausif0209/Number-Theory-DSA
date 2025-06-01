public class LeetCode2929 {
   //Brute Force:- (limit)^3
    public long distributeCandies(int n, int limit) {
        limit=Math.min(limit,n);
        long count=0;
        for(int i=0;i<=limit;i++){
            int max=Math.min(n-i,limit);
            int min=n-i-max;
            count+=Math.max(0,max-min+1);
        } return count;
    }
}
