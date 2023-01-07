package GFG.school;

// Fascinating number

public class GFG55 {
  public static void main(String[] args) {
    System.out.println(new GFG55().fascinating(192));
  }

  boolean fascinating(long n) {
    if (String.valueOf(n).length() >= 3) {
      String num = String.valueOf(n) + String.valueOf(n * 2) + String.valueOf(n * 3);
      if (num.length() == 9 && num.contains("1") && num.contains("2") && num.contains("3") && num.contains("4")
          && num.contains("5") && num.contains("6") && num.contains("7") && num.contains("8") && num.contains("9")) {
        return true;
      }
    }
    return false;
  }
}
