public class GreetMe{
  public static String greet(String name){
    String name2 = "";
    for(int i=0; i<name.length(); i++){
      if(i == 0){
       
        name2 +=  Character.toUpperCase(name.charAt(i));
      }
      else{
        name2 += Character.toLowerCase(name.charAt(i));
      }
    }
    return String.format("Hello %s!",name2);
  }
}