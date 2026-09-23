public class polymorphism {

  public static class Cat{
    void speak(){
      System.out.println("meow");
    }
  }
  public static class Dog{
    void speak(){
      System.out.println("bark");
    }
  }
  public static class Sher{
    void speak(){
      System.out.println("roar");
    }
  }
  public static class Man{
    void speak(){
      System.out.println("hello");
    }
  }
  public static void main(String[] args) {
    Dog tommy = new Dog();
    Cat kitty = new Cat();
    Sher sher = new Sher();
    Man yash = new Man();
    tommy.speak();
    kitty.speak();
    sher.speak();
    yash.speak();
  }
}
