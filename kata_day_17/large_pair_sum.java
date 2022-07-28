import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution{
    public static int largestPairSum(int[] numbers){
        // your code here
         int[] sorted = Arrays.stream(numbers).sorted().toArray();
 
        int[] reversesorted = IntStream.rangeClosed(1, sorted.length)
                .map(i -> sorted[sorted.length-i])
                .toArray();
        return reversesorted[1] + reversesorted[0];
    }
}