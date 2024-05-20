package com.medium.orlandolorenzodeveloper.java_streams_you_wont_regret_learning_them.other_examples.finding_the_maximum_and_minimum_element_in_a_list;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

public class FindingMaximumAndMinimumElementInAList {
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
      Optional<Integer> minimumElement =
        listOfNumbers.stream().min(Integer::compareTo);
      out.printf(
        "Minimum element in the list '%s' is '%d'\n",
        listOfNumbers,
        minimumElement.orElseThrow()
      );
      Optional<Integer> maximumElement =
        listOfNumbers.stream().max(Integer::compareTo);
      out.printf(
        "Maximum element in the list '%s' is '%d'\n",
        listOfNumbers,
        maximumElement.orElseThrow()
      );
    return;
  }
}