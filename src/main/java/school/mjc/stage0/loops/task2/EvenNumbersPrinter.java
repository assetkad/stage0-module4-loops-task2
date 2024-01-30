package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
  public void printEvenNumbers(int printTillInclusive) {
    int i = 0;
    while (i <= printTillInclusive) {
      if (i == 0 || (i % 2 == 0 && printTillInclusive >= i)) {
        System.out.println(i);
      }
      i++;
    }
  }
}
