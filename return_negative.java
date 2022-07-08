public class Kata {

  public static int makeNegative(final int x) {
    
    return  x <= 0? x:x * -1; // Your code here.
    
  }
  public static int makeNegative(final int x) {
    return -abs(x);
  }
}