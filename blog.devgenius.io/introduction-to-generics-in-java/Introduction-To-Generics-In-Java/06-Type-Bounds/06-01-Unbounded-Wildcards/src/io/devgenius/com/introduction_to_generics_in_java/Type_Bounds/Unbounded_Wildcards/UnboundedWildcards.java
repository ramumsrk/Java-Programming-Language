package io.devgenius.com.introduction_to_generics_in_java.Type_Bounds.Unbounded_Wildcards;

import java.util.Collection;

import static java.lang.System.out;

public class UnboundedWildcards {
  static public void printCollection(Collection<?> collection) {
      for ( Object element : collection ) {
        out.printf( "Element: %s\n" , element );
      }
    return;
  }
}
