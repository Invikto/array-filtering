package arthur.utils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayCreator {

  public int[] getArrayOfInteger(int length) {
    int[] newArray = IntStream.range(0, length).map(j -> j + 1).toArray();
    System.out.printf("The created array is:\n%s\n", Arrays.toString(newArray));
    return newArray;
  }

}
