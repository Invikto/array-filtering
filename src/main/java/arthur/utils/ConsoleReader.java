package arthur.utils;

import java.util.Scanner;

public class ConsoleReader {

  public int getIntegerValue(String prompt) {
    System.out.println(prompt);
    Scanner console = new Scanner(System.in);
    int integerValue;
    if (console.hasNextInt()) {
      integerValue = console.nextInt();
    } else {
      integerValue = this.getIntegerValue("[31mPlease, enter an integer.[0m");
    }
    return integerValue;
  }

  public String getStringValue(String prompt) {
    System.out.println(prompt);
    Scanner console = new Scanner(System.in);
    return console.nextLine();
  }

}
