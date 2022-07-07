import java.util.List;
import java.util.ArrayList;

public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
    List result = new ArrayList();
    for(var i = 1; i < array.length; i++){
      if(array[i]%i == 0) result.add(array[i]);
    }
    int[] arr = new int[result.size()];
    for(int i = 0; i < result.size(); i++) arr[i] = (int)result.get(i);
    
    return arr;
  }
}