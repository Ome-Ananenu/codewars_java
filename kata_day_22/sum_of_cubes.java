import java.util.*;
import java.lang.*;

public class Solution{
  public static long sumCubes(long n){
    long ans = 0;
    
    for(long i=1; i<= n; i++){
      ans += (long)Math.pow(i,3);
    }
    return ans;
  }
}