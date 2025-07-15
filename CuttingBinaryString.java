public class CuttingBinaryString {
   int min=Integer.MAX_VALUE;
    public int cuts(String s) {
        if(s.charAt(0)=='0') return -1;
        if(s.length()==1) return 1;
        helper(s,0);
        return (min==Integer.MAX_VALUE)?-1:min;
        }
    private void helper(String s,int count){
            min=Math.min(min,count);
            return ;
        }
        if(s.charAt(0)=='0') return;
        StringBuilder binary= new StringBuilder();
        for(int i=0;i<s.length();i++) {
            binary.append(s.charAt(i));
            int decimal=Integer.parseInt(binary.toString(),2);
            if (isPowerOfFive(decimal)) helper(s.substring(i + 1), count + 1);
        }
    }
    public boolean isPowerOfFive(int n) {
        if (n < 1) return false;
        while (n % 5 == 0) n /= 5;
        return n == 1;
    }
}
