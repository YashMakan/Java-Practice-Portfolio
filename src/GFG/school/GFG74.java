package GFG.school;

// count type of characters

public class GFG74 {
  public static void main(String[] args) {
    System.out.println(new GFG74().count("#GeeKs01fOr@gEEks07"));
  }

  int[] count(String s) {
    int uppercase = 0;
    int lowercase = 0;
    int numeric = 0;
    int special = 0;

    for (char c : s.toCharArray()) {
      if (Character.isUpperCase(c)) {
        uppercase++;
      } else if (Character.isLowerCase(c)) {
        lowercase++;
      } else if (Character.isDigit(c)) {
        numeric++;
      } else {
        special++;
      }
    }

    return new int[] { uppercase, lowercase, numeric, special };
  }
}
