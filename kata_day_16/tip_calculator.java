public class TipCalculator {

  public static Integer calculateTip(double amount, String rating) {


    if("Terrible".equalsIgnoreCase(rating))   return 0;
    if("Poor".equalsIgnoreCase(rating))       return (int)Math.ceil(0.05*amount);
    if("Good".equalsIgnoreCase(rating))       return (int)Math.ceil(0.10*amount);
    if("Great".equalsIgnoreCase(rating))      return (int)Math.ceil(0.15*amount);
    if("Excellent".equalsIgnoreCase(rating))  return (int)Math.ceil(0.20*amount);
    
    return null;

}
}