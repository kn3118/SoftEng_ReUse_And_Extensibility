package ic.doc.templatemethod;

public class TriangleNumbersSequence extends TemplateSequenceNumbers {

  @Override
  public int positiveTerm(int i) {
    if (i < 1) {
      return 1;
    }
    return ((i + 1) * (i + 2)) / 2;
  }

}
