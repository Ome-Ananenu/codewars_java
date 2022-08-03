import java.util.*;
import java.util.stream.IntStream;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
   
String temp = Integer.toString(num);
int[] numbers = new int[temp.length()];
for (int i = 0; i < temp.length(); i++) {
    numbers[i] = temp.charAt(i) - '0';
}
    

    Arrays.sort(numbers);
int[] reversed = IntStream.range(0, numbers.length)
                          .map(i -> numbers[numbers.length-i-1])
                          .toArray();
  
        // Printing the elements
        System.out.println(Arrays.toString(reversed));
     int res=0;
    for(int i=0;i<reversed.length;i++) {
         res=res*10+reversed[i];
    }
    
    System.out.print(reversed);
    return res;
  }
}