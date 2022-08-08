public class Hello{
  public String sayHello(String [] name, String city, String state){
    //code here
    String spa = " ";
    return String.format("Hello, %s! Welcome to %s, %s!",name[0]+spa+name[1],city,state);
  }
}