import java.util.*;

public class PassingClassToMethod {
  public static class car{
    int seats;
    String name;
    double len;
    String type;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    car c = new car();
    System.out.println("Enter the details of your car");
    c.seats = 6;
    c.name = "maruti";
    c.len = 10;
    c.type = "sedan";
    change(c);
    System.out.println("The details of your car are: " + c.seats + ", " + c.name + ", " + c.len + ", " + c.type);

  }
  private static void change(car x){
    x.seats = 111;
  }
}