package com.medium.orlandolorenzodeveloper.java_streams_you_wont_regret_learning_them.terminal_operations;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

public class CountOfStringsStartingWithLetterA {
  static public void main( String... args ) {
      List<String> sampleNames = Arrays.asList(
        "Alice",
        "Bob",
        "Charlie",
        "Anna",
        "David"
      );
      long countOfStringsStartingWithLetterA =
        sampleNames.stream().filter(sampleName -> sampleName.startsWith("A")).count();
      out.printf(
        "Count of all strings starting with letter 'A' are '%d'\n",
        countOfStringsStartingWithLetterA
      );
    return;
  }
}