package GFG.school;

// Java Inheritence

class cls1 {
  void add(int p, int q) {
    System.out.println(p + q);
  }
}

class cls2 extends cls1 {
  void mul(int p, int q) {
    System.out.println(p * q);
  }

  void task(int p, int q) {
    super.add(p, q);
    mul(p, q);
    super.add(p * p, q * q);
  }
}

public class GFG76 {
  public static void main(String[] args) {
    cls2 foo = new cls2();
    foo.task(10, 2);
  }
}
