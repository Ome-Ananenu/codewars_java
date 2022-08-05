public class Solution
{
    public static int[] rowWeights (final int[] weights)
    {
      int[] fin = new int[2];
      
      for(int i=0; i<weights.length; i++){
        if(i % 2 == 0){
          fin[0] += weights[i];
        }
        else{
          fin[1] += weights[i];
        }
      }
        return fin; // Do your magic!
    }
}