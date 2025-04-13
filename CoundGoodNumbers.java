public class CoundGoodNumbers {
    public int countGoodNumbers(long n) {
        long mod=(int)(Math.pow(10,9))+7;
        return (int)((modPow(5,(n+1)/2,mod)*modPow(4,n/2,mod))%mod);
    }
    long modPow(long base,long exp,long mod){
           long ans=1;
           base%=mod;
           while(exp>0){
              if((exp&1)==1) ans=(ans*base)%mod;
              base=(base*base)%mod;
              exp>>=1;
           }
           return ans;
    }
}
