package com.medium.orlandolorenzodeveloper.java_streams_you_wont_regret_learning_them.intermediate_operations;

import java.util.Arrays;
import java.util.List;

public class StringBeginningWithLetterA {
  static public void main( String... args ) {
      List<String> sampleNames = Arrays.asList(
        "Alice",
        "Bob",
        "Charlie",
        "Anna",
        "David"
      );
      sampleNames.stream().filter(sampleName -> sampleName.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
    return;
  }
}