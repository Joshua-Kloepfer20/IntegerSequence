import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence {
  private int currentIndex;
  private int[] data;
  public ArraySequence(int[] other) {
    data = new int[other.length];
    for (int i = 0; i < data.length; i++) {
      data[i] = other[i];
    }
    currentIndex = 0;
  }
  public ArraySequence(IntegerSequence otherseq) {
    data = new int[otherseq.length()];
    int i = 0;
    while (otherseq.hasNext()) {
      data[i] = otherseq.next();
      i+=1;
    }
  }
  public boolean hasNext() {
    return currentIndex < data.length;
  }
  public int next() {
    if (hasNext()) {
      currentIndex += 1;
      return data[currentIndex - 1];
    }
    else {
      throw new NoSuchElementException();
    }
  }
  public int length() {
    return data.length;
  }
  public void reset() {
    currentIndex = 0;
  }
}
