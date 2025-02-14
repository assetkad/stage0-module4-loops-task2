package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
  public void printFactorialRow(int printToInclusive) {
    if (printToInclusive == 0) {
      System.out.println(1);
      return;
    }
    long factorial = 1;
    for (int i = 1; i <= printToInclusive; i++) {
      if (i == 1)
        System.out.println(1);
      System.out.println(factorial *= i);
    }
  }
}
