package io.devgenius.com.introduction_to_generics_in_java.Generics_And_Inheritance.Why_Generics_Are_Invariant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static java.lang.System.out;

public class Practice {
  public static void main( String... args ) {
      /*
       * List<?>
       * <?> is an unbounded wildcard
       * List<? extends Number>
       * <? extends Number> bounded wildcard
       * <? extends Number> is an upper-bounded wildcard
       */
      List<Number> miscellaneous = new ArrayList<>();
      miscellaneous.add(1);
      miscellaneous.add(1.0F);
      miscellaneous.add(2.0);
      miscellaneous.add(2L);

      Practice.printCollection(miscellaneous);
    return;
  }
  public static void printCollection(Collection<?
    extends Number> collection) {
      for ( Number element : collection ) {
        out.printf( "Element: %s\n" , element );
      }
    return;
  }
}
