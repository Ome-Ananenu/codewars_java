public class Printer {
    
    public static String printerError(String s) {
      String right = "abcdefghijklm";
      int count = 0;
      String ans = String.format("%s/%s",count,s.length());
      
      for(int i=0; i<s.length(); i++){
        if(!right.contains(s.indexOf(i))){
          count++;
        }
      }
        // your code
    }
}
yyyyyyy