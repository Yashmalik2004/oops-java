public class Main {
  String name;
  int subject;
  int[] marks;
  int c;

  Main(int s){
    marks = new int[s];
  }
  Main(int[] m){
    marks = m;
  }
  void setMarks(int m){
    marks[c++] = m;
  } 

  public static void main(String[] args) {
    Main m1 = new Main(3);
    int[] arr = {1,2,3,4,5};
    Main m2 = new Main(arr);
    Main m3 = new Main(1);
    m1.setMarks(10);
    m1.setMarks(20);
    m1.setMarks(30);

    System.out.println("marks are: ");
    for(int i=0;i<m1.marks.length;i++){
      System.out.println(m1.marks[i]);
    }
    for(int i=0;i<m2.marks.length;i++){
      System.out.println(m2.marks[i]);
    }
  }
}
