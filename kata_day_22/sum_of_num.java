public class SequenceSum{

  public static String showSequence(int value){
    String ans = "";
    int num = 0;
     if (value < 0)
      return value + "<0";
    
    if (value == 0)
      return "0=0";
    
    for(int i=0; i<= value; i++){
      if(i == value){
        ans += i;
        num+= i;
      }
      else{
        ans += i + "+";
        num+= i;
      }
    }
    return String.format("%s = %s", ans,num);
    }
}