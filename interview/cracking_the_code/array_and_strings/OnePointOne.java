/*
  Implement an algorithm to determine if a string has all unique characters.
  What if you cannot use additional data structures?
 */

package array_and_strings;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OnePointOne {
  public boolean isUniqueChar(final String input) {
    final Set<Character> existingChars = new HashSet<>();
    for (int i = 0; i < input.length(); i ++) {
      final char character = input.charAt(i);
      if (existingChars.contains(character)) {
        return false;
      }
      existingChars.add(character);
    }
    return true;
  }

  public static void main(final String[] args) {
    final OnePointOne onePointOne = new OnePointOne();
    assertTrue(onePointOne.isUniqueChar("abc"));
    assertFalse(onePointOne.isUniqueChar("abcdefgb"));
  }
}