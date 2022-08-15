public class Kata{
  public static double fuelPrice(int litres, double pricePerLiter) {
    double discount;
    if(litres >= 12){
      discount = 0.25;
    }
    else{
      discount = litres / 2 * 0.05;
    }
    return litres * (pricePerLiter - discount);
  }
}