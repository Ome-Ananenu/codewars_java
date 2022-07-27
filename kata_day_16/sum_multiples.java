public class Kata {
    public static long sumMul(int n, int m) {
        // TODO implement
      if(n<1 || m<1){
        throw new IllegalArgumentException("n or m < 1");
      }
      int sum =0;
      for(int i=0; i<m; i++){
        if(i % n ==0){
          sum += i;
        }
        
      }
        return sum;
    }
}
