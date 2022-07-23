import java.util.Arrays;

public class Kata {

  public static int[] flattenAndSort(int[][] array) {   
    int len = 0;
    for (int l=0; l<array.length;l++){
      len += array[l].length;
    }
    
    int[] newarr = new int[len];
    int counter = 0;
    for (int i=0; i<array.length;i++) {
      for (int j=0; j<array[i].length;j++){
          newarr[counter] = array[i][j];
          counter++;
      }
    }  
    
    Arrays.sort(newarr);
    return newarr;
  }

}