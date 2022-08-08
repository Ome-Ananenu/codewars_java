public class Hello{
  public String sayHello(String [] name, String city, String state){
    //code here
    String spa = "";
    for(int i=0; i<name.length; i++){
      if(i != name.length -1){
         spa += name[i] + " ";
      }
     else{
        spa += name[i];
     }
    }
    
    return String.format("Hello, %s! Welcome to %s, %s!",spa,city,state);
  }
}

public class Hello{
  public String sayHello(String[] name, String city, String state){
    return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
  }
}