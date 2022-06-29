import java.util.List;

public class MixedSum {

 /*
  * Assume input will be only of Integer o String type
  */
	public int sum(List<?> mixed) {	
		
    
    int sum = 0;
    for (Object o : mixed) {
      if (o instanceof Integer) {
        sum += (Integer) o;
      } else if (o instanceof String) {
        sum += Integer.valueOf((String) o);
      }
    }
    return sum;
  }

}