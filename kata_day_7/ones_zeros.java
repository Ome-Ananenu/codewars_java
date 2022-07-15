import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String str = "";
      for(int i : binary){
        str += i;
      }
      return Integer.parseInt(str,2);
    }
}