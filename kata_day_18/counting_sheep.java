class Kata {
  public static String countingSheep(int num) {
    //Add your code here
    String ans = "";
    
    for(int i=1; i<=num; i++){
      ans += String.format("%s sheep...",i);
    }
   
    return ans;
  }
}