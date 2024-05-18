package io.devgenius.com.introduction_to_generics_in_java.Implementing_Generic_Methods.Example_Of_A_Generic_Method;

public class ArrayUtilities {
  public static <T> void swap(T[] array , int index , int anotherIndex) {
      T temporary = array[index];
      array[index] = array[anotherIndex];
      array[anotherIndex] = temporary;
    return;
  }
}
