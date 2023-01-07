package GFG.school;

import java.util.HashMap;

// The dice problem

public class GFG38 {
  public static void main(String[] args) {

  }

  static int oppositeFaceOfDice(int N) {
    HashMap<Integer, Integer> diceMap = new HashMap<>();
    diceMap.put(1, 6);
    diceMap.put(2, 5);
    diceMap.put(3, 4);
    diceMap.put(4, 3);
    diceMap.put(5, 2);
    diceMap.put(6, 1);

    return diceMap.get(N);
  }
}
