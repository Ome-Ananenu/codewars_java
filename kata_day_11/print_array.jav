import java.util.*;

public class ArrayPrinter {

    public static String printArray(Object array[]) {
     
     
     String[] str = new String[array.length];
     
     for(int i=0; i<array.length; i++) {
     
     str[i]=String.valueOf(array[i]) ;
     
     }
     
     return String.join(",", str);
    }
}