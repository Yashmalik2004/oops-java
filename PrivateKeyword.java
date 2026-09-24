public class PrivateKeyword {
  public static class Students{
    String name = "yash";
    private int rn = 6;
    double cgpa;
    int getrn(){ //getter
      return rn;
    }

    void setrn(int x){ //setter
      rn = x;
    }
    // void print2(){
    //   print();
    // }
    void setnget(int x){
      rn = x;
      System.out.println(rn);
    }

  }
  public static void main(String[] args) {
    // private keyword is used to restrict the access of a class, method or variable to only within the class it is defined in.
    // private class cannot be accessed from outside the class it is defined in.
    // private method cannot be accessed from outside the class it is defined in.
    // private variable cannot be accessed from outside the class it is defined in.
    Students s1 = new Students();
    //s1.rn = 6; // this will give an error because rn is private and cannot be accessed from outside the class it is defined in.
    s1.cgpa = 10;
    s1.setrn(111);
    System.out.println(s1.getrn());
    s1.setnget(69);
  }
}