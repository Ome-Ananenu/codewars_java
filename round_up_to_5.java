package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    
    int i = 1;
        while (number % 5 != 0) {
            number++;
            i++;
        }
    
    return number;
  }
  public static int roundToNext5(int number) {
    while (number % 5 != 0) {
      number++;
    }
    return number;
  }
}
