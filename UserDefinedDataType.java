
public class UserDefinedDataType {
  public static class student{
    String name;
    int rn;
    int age;

    student(String name, int rn, int age){
      this.name = name;
      this.age = age;
      this.rn = rn;
    }

    void print(){
      System.out.println(name + " " + age + " " + rn);
    }
  }
  public static void main(String[] args) {
    student s1 = new student("yash",6,22);
    student s2 = new student("sneha",10,22);
    student s3 = new student("ilia",17,28);

    s1.print();
    s2.print();
    s3.print();
  }
}
  


