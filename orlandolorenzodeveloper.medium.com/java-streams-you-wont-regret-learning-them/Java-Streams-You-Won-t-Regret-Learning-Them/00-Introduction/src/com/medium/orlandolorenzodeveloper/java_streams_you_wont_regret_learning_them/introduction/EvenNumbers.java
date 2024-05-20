package com.medium.orlandolorenzodeveloper.java_streams_you_wont_regret_learning_them.introduction;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class EvenNumbers {
  public static void main( String... args ) {
      List<Integer> listOfNumbers = List.of(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9
      );
      List<Integer> listOfEvenNumbers =
        listOfNumbers.stream().filter( inputNumber -> inputNumber % 2 == 0 ).collect(Collectors.toList());
      out.printf(
        "List of even numbers: '%s'\n",
        listOfEvenNumbers
      );
      int sumOfEvenNumbers =
        listOfEvenNumbers.stream().mapToInt(Integer::intValue).sum();
      out.printf(
        "Sum of even numbers in list '%s' is '%d'\n",
        listOfEvenNumbers,
        sumOfEvenNumbers
      );
    return;
  }
}
