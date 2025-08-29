public class FlowerGame {
  public long flowerGame(int n, int m) {
        int odd1=(n%2==0)?n/2:n/2+1;
        int odd2=(m%2==0)?m/2:m/2+1;
        return 1L*(n/2)*odd2 + 1L*odd1*(m/2);
    }
}
