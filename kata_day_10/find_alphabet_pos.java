public class Kata
{
  public static String position(char alphabet)
  {
		char inputLetterToLowerCase= Character.toLowerCase(alphabet);
		int asciiValueOfinputChar= (int)inputLetterToLowerCase;
		int position= asciiValueOfinputChar-96;
		return String.format("Position of alphabet: %s",position);
    
  }
}