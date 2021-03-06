package arthur;

import arthur.utils.ArrayCreator;
import arthur.utils.ArrayFilter;
import arthur.utils.ConsoleReader;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ConsoleReader console = new ConsoleReader();
    int arrayLength = console.getIntegerValue("Please, enter a length of an array to create.");

    ArrayCreator arrayCreator = new ArrayCreator();
    int[] array = arrayCreator.getArrayOfInteger(arrayLength);

    ArrayFilter arrayFilter = new ArrayFilter();
    String mode;
    boolean isModeCorrect;
    do {
      mode = console.getStringValue("Please, choose a filter mode ('[32mfor[0m', '[32mforEach[0m' or '[32mstream[0m').");
      isModeCorrect = arrayFilter.isFilterModeCorrect(mode);
      if (!isModeCorrect) {
        System.out.println("[31mThe entered mode is incorrect.[0m");
      }
    } while (!isModeCorrect);

    ArrayList<Integer> resultArray = arrayFilter.getEvenNumbers(array, mode);

    System.out.printf("Even numbers of the array are:\n%s\n", resultArray.toString());
  }

}
