public class TrafficLights {

  public static String updateLight(String current) {
  
    if(current == "green"){
      return "yellow";
    }
    if(current == "red"){
      return "green";
    }
    if(current == "yellow"){
      return "red";
    }
return " ";
  }


  public static String updateLight(String current) {
  
    return (current.equals("red") ? "green" : current.equals("yellow") ? "red" : "yellow");
    
  }
  
}