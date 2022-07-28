import java.lang.Character;

public class JadenCase {

  public String toJadenCase(String phrase) {
    if(phrase == null || phrase.equals("")) return null;
    
    char[] array = phrase.toCharArray();
    
    for(int x = 0; x < array.length; x++) {
      if(x == 0 || array[x-1] == ' ') {
        array[x] = Character.toUpperCase(array[x]);
      }
    }
    
    return new String(array);
  }

}
public class JadenCase {

	public String toJadenCase(String phrase) {
    if(phrase == null || phrase ==""){
      return null;
    }

    String newStr = "";
		// TODO put your code below this comment
		for(int i=0; i<phrase.length(); i++){
      if(i == 0 || phrase.charAt(i - 1) == ' ' && phrase.charAt(i) != Character.toUpperCase(phrase.charAt(i)) ){
        newStr += Character.toUpperCase(phrase.charAt(i));
      }
      else{
        newStr += phrase.charAt(i);
      }
    }

		return newStr;
	}

}