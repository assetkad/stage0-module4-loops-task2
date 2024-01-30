package school.mjc.stage0.loops.task2;

public class Multiplication {
  public void printMultiplied(int multiplyByAndToInclusive) {
    if (multiplyByAndToInclusive == 0) {
      return;
    }
    for (int i = 0; i <= Math.abs(multiplyByAndToInclusive); i++) {
      int result = i * multiplyByAndToInclusive;
      System.out.println(result);
    }
  }
}
