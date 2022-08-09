public class Solution
{
    public static String autoMorphic(int number)
    {
        return Math.abs(number * number) % 10 == number || 
          Math.abs(number * number) % 100 == number
          ||Math.abs(number * number) % 1000 == number
          ||Math.abs(number * number) % 10000 == number?"Automorphic":"Not!!";
    }
}