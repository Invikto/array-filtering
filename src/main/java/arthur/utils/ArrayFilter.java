package arthur.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayFilter {

  private final String[] ARRAY_FILTER_MODES = new String[]{"for", "forEach", "stream"};

  public boolean isFilterModeCorrect(String mode) {
    return Arrays.asList(ARRAY_FILTER_MODES).contains(mode);
  }

  public ArrayList<Integer> getEvenNumbers(int[] array, String mode) {
    ArrayList<Integer> arrayOfEvenNumbers;
    switch (mode) {
      case "for":
        arrayOfEvenNumbers = this.getEvenNumbersByFor(array);
        break;
      case "forEach":
        arrayOfEvenNumbers = this.getEvenNumbersByForEach(array);
        break;
      case "stream":
        arrayOfEvenNumbers = this.getEvenNumbersByStream(array);
        break;
      default:
        throw new IllegalStateException(String.format("Unexpected value: %s.", mode));
    }
    return arrayOfEvenNumbers;
  }

  private ArrayList<Integer> getEvenNumbersByFor(int[] array) {
    ArrayList<Integer> arrayOfEvenNumbers = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 == 0) {
        arrayOfEvenNumbers.add(array[i]);
      }
    }
    return arrayOfEvenNumbers;
  }

  private ArrayList<Integer> getEvenNumbersByForEach(int[] array) {
    ArrayList<Integer> arrayOfEvenNumbers = new ArrayList<>();
    for (int i : array) {
      if (i % 2 == 0) {
        arrayOfEvenNumbers.add(i);
      }
    }
    return arrayOfEvenNumbers;
  }

  private ArrayList<Integer> getEvenNumbersByStream(int[] array) {
    ArrayList<Integer> arrayOfEvenNumbers = new ArrayList<>();
    IntStream stream = Arrays.stream(array);
    stream.filter(i -> i % 2 == 0).forEachOrdered(arrayOfEvenNumbers::add);
    return arrayOfEvenNumbers;
  }

}
