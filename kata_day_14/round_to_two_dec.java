public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    //Write your code here
    return (double) Math.round(number * 100) / 100;

  }
}