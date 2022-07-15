class Arge {
    
    public static int nbYear(int p0, double percent, int aug, int p) {
        int years = 1;
      int currentP = p0+ (int)(p0 * percent/100) + aug;;
      
    
      while(currentP < p){
       
        currentP = currentP + (int)(currentP * percent/100) + aug;
         years++;
      }
  
      return years;
    }
}