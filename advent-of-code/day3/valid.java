import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

/**
 * valid
 */
public class valid {
  int count = 0;

  public void validate(String input) {
    String[] words = input.split(" ");
    Set<String> set = new HashSet<String>();
    for (String word : words) {
      if (set.contains(word)) {
        return;
      }
      set.add(word);
    }
    count++;
    return;
  }

  public static void main(String[] args) {
    try {
      valid x = new valid();
      File myObject = new File("/Users/amitkarunakaran/Desktop/coding/united/advent-of-code/day3/input.txt");
      Scanner myReader = new Scanner(myObject);

      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        x.validate(data);
      }

      System.out.println("valid" + x.count);
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}