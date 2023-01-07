package GFG.school;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// Check for binary

public class GFG11 {
  public static void main(String[] args) {
    System.out.println(isBinary("1"));
  }

  static boolean isBinary(String str) {

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) != '0' && str.charAt(i) != '1')
        return false;
    }

    return true;

  }

  static boolean isBinaryHighLevel2(String str) {
    // converting string to array
    HashSet<String> mySet = new HashSet<String>(Arrays.asList(str.split("")));
    return mySet.contains("0") && mySet.contains("1") && mySet.size() == 2;
  }

  static boolean isBinaryHighLevel(String str) {
    // converting string to array
    Set<String> strings = Arrays.asList(str.split("")).stream()
        .collect(Collectors.toSet());
    return strings.contains("0") && strings.contains("1") && strings.size() == 2;
  }
}
