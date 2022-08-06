public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    // Program me!
    return name.startsWith("r") ||  name.startsWith("R")?  String.format( "%s plays banjo",name):
      String.format("%s does not play banjo",name);
   
  }
}