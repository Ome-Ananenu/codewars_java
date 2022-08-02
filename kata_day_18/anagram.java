import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Kata {
  public static boolean isAnagram(String test, String original) {
    // your code goes here
    if(test.length() != original.length()){
        return false;
    }
    
    char[] charArraytest = test.toLowerCase().toCharArray();
    char[] charArrayoriginal = original.toLowerCase().toCharArray();
    
        Arrays.sort(charArraytest);
        Arrays.sort(charArrayoriginal);
 
        // Compare sorted strings
        for (int i = 0; i < test.length(); i++)
            if (charArraytest[i] != charArrayoriginal[i])
                return false;
 
    
    return true;
  }
}