import java.util.*;

public class Students {
  String name;
  private int age;

  Students(String name, int age){
    this.name = name;
    this.age = age;
    print();
  }
  Students(int age, String name){
    this.name = name;
    this.age = age;
    print();
  }

  void print(){
    System.out.println("merko frk nhi pdta order se, yeh lo values: "+name + " " + age);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Students s1 = new Students(sc.next(),sc.nextInt());
    Students s2 = new Students(sc.nextInt(),sc.next());
  }

}

