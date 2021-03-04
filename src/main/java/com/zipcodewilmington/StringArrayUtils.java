package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contains = false;
        for (String element : array) {
            if (element == value) {
                contains = true;
            }
        }
        return contains;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length/2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPalindrome = false;
        for (int i = array.length -1; i > 0; i--) {
            if (array[i] == array[array.length - 1 - i]) {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPangramic = true;
        String arrayJoined = Arrays.toString(array).toLowerCase();
        String alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String[] alphabetArray = alphabet.split(" ");
        for (int i = 0; i < alphabetArray.length - 1; i++) {
            if (!arrayJoined.contains(alphabetArray[i])) {
                isPangramic = false;
                break;
            }
        }
        return isPangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numberOfOccurences = 0;
        for (String element : array) {
            if (element == value) {
                numberOfOccurences++;
            }
        }
        return numberOfOccurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int indexToRemove = 0;
        String[] arraySansValue = new String[array.length - 1];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == valueToRemove) {
                indexToRemove = i;
            }
        }
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == indexToRemove) {
                continue;
            }
        arraySansValue[k++] = array[i];
        }

        return arraySansValue;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
      int count = 0;
      for (int i = 0; i < array.length - 1; i++) {
          if (array[i].equals(array[i + 1])) {
              count++;
              continue;
          }

      }
      String[] temp = new String[array.length - count];

      for (int i = 0, j = 0; i < array.length - 1; i++) {
          if (array[i].equals(array[i + 1])) {
              continue;
          }
              temp[j] = array[i];
              j++;
          temp[temp.length - 1] = array[array.length - 1];
      }
      return temp;
    }
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> input = new ArrayList<String>();
        for (String element : array) {
            input.add(element);
        }

        for (int j = 0; j < input.size() - 1; j++) {
            if (input.get(j) == input.get(j + 1)) {
                input.set(j,input.get(j) + input.get(j + 1));
                input.remove(j + 1);
            }
        }

        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).contains(input.get(i+1))) {
                input.set(i,input.get(i) + input.get(i + 1));
                input.remove(i + 1);
            }
        }

        String[] packDuplicates = input.toArray(new String[input.size()]);

        return packDuplicates;
    }
}
