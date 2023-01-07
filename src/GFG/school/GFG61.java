package GFG.school;

// Complete the skills

public class GFG61 {
  public static void main(String[] args) {

  }

  public void scores(long a[], long b[]) {
    // store the answer as
    // GFG.ca=3;
    // GFG.cb=5;
    // Your code goes here
    int scoreA = 0;
    int scoreB = 0;
    for (int i = 0; i < b.length; i++) {
      if (a[i] > b[i]) {
        scoreA++;
      } else if (a[i] < b[i]) {
        scoreB++;
      }
    }
    System.out.println(scoreA);
    System.out.println(scoreB);
    // GFG.ca = scoreA;
    // GFG.cb = scoreB;
  }
}
