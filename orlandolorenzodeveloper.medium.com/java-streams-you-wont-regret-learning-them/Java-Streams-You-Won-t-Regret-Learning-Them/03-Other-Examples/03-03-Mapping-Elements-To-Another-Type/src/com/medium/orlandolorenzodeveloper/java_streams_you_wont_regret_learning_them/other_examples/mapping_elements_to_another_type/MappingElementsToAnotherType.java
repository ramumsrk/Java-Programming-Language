package com.medium.orlandolorenzodeveloper.java_streams_you_wont_regret_learning_them.other_examples.mapping_elements_to_another_type;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class MappingElementsToAnotherType {
  static public void main( String... args ) {
      List<Integer> listOfNumbers = Arrays.asList(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10
      );
      List<Integer> listOfNumbersDoubled =
        listOfNumbers.stream().map( inputNumber -> inputNumber * inputNumber ).collect(Collectors.toList());
      out.printf(
        "List of numbers that are doubled: '%s'\n",
        listOfNumbersDoubled
      );
    return;
  }
}