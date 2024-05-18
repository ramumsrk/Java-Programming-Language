package io.devgenius.com.introduction_to_generics_in_java.Implementing_Generic_Methods.Example_Of_A_Generic_Method;

import java.util.Arrays;

import static java.lang.System.out;

public class ArrayUtilitiesDemo {
  public static void main( String... args ) {
      Integer[] integerArray = {
        1,
        2,
        3,
      };
      out.printf("Before swap:\n%s\n",Arrays.toString(integerArray));
      ArrayUtilities.swap(
        integerArray,
        0,
        integerArray.length - 1
      );
      out.printf("After swap:\n%s\n",Arrays.toString(integerArray));
      String[] stringsArray = {
        "One",
        "Two",
        "Three",
      };
      out.printf("Before swap:\n%s\n",Arrays.toString(stringsArray));
      ArrayUtilities.swap(
        stringsArray,
        0,
        stringsArray.length - 1
      );
      out.printf("After swap:\n%s\n",Arrays.toString(stringsArray));
    return;
  }
}