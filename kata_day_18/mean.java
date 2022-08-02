public class GrassHopper {
    
    public static int findAverage(int[] nums) {
int sum = 0;

for (int i : nums){
   sum += i;
}
   
        return sum/nums.length;
    }
}