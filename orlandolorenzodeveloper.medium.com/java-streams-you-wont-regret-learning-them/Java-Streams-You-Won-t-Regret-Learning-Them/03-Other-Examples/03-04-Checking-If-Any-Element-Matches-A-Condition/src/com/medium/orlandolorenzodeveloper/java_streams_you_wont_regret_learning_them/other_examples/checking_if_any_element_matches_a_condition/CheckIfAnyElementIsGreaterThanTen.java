package com.medium.orlandolorenzodeveloper.java_streams_you_wont_regret_learning_them.other_examples.checking_if_any_element_matches_a_condition;

import java.util.List;

import static java.lang.System.out;

public class CheckIfAnyElementIsGreaterThanTen {
  public static void main( String[] args ) {
      List<Integer> listOfNumbers = List.of(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11
      );
      listOfNumbers.stream().filter( inputNumber -> inputNumber > 10 ).forEach(out::println);
      boolean anyElementGreaterThanTen =
        listOfNumbers.stream().anyMatch(inputNumber -> inputNumber > 10);
      out.printf(
        "Is there any element greater than 10? '%s'\n",
        anyElementGreaterThanTen
      );
    return;
  }
}