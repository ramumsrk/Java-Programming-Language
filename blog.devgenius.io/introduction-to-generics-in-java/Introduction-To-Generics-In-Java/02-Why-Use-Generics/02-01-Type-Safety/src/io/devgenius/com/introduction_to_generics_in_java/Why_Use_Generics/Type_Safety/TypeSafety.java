package io.devgenius.com.introduction_to_generics_in_java.Why_Use_Generics.Type_Safety;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class TypeSafety {
  public static void main( String... args ) {
      List<Integer> numbers = new ArrayList<>();
      if (numbers.add(4)) {
        out.printf("%s",numbers);
      }
    return;
  }
}
