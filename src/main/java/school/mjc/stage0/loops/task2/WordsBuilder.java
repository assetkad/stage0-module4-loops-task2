package school.mjc.stage0.loops.task2;

public class WordsBuilder {
  public void buildPhrase(char... chars) {
    StringBuilder stringBuilder = new StringBuilder();

    for (char c : chars) {
      stringBuilder.append(c);
    }

    System.out.print(stringBuilder.toString());
  }
}
