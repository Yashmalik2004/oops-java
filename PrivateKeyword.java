public class PrivateKeyword {
  public static class Students{
    String name = "yash";
    private int rn = 6;
    double cgpa;
    private void print(){
      System.out.println(name + " " + rn + " " + cgpa);
    }
    void print2(){
      print();
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
    s1.print2();
  }
}