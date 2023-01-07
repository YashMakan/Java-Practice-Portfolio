package Leetcode.Arrays;

// 2114. Maximum Number of Words Found in Sentences

public class Leet8 {
  public static void main(String[] args) {
    System.out.println(new Leet8().mostWordsFound(
        new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
  }

  public int mostWordsFound(String[] sentences) {
    int maxSplits = 0;
    for(String sentence : sentences){
      int sentenceSplitLength = sentence.split(" ").length;
      if(maxSplits < sentenceSplitLength){
        maxSplits = sentenceSplitLength;
      }
    }
    return maxSplits;
  }
}
