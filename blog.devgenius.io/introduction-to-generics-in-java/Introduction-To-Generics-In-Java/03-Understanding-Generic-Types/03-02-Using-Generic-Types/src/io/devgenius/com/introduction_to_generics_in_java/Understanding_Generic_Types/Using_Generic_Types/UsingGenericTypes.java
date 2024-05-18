package io.devgenius.com.introduction_to_generics_in_java.Understanding_Generic_Types.Using_Generic_Types;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class UsingGenericTypes {
  static public void main( String[] args ) {
      List<String> names = new ArrayList<>();
      if (names.add("Emily")) {
        out.printf("%s\n",names);
      }
      if (names.add("Adam")) {
        out.printf("%s\n",names);
      }
    return;
  }
}