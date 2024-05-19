package com.medium.gainjavaknowledge.how_is_java8_takeWhile_and_dropWhile_different_from_filter.introduction;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class StreamAPIMethods {
  public static void main(String[] args ) {
      List<Integer> numbers = Arrays.asList(
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
        9,
        8,
        7,
        6,
        5,
        4,
        3,
        2,
        1
      );
      List<Integer> takeWhileANumberIsLessThanFive =
        numbers.stream().takeWhile(number -> number < 5).collect(Collectors.toList());
      out.printf(
        "Numbers that are less than five are: %s\n",
        takeWhileANumberIsLessThanFive
      );
      List<Integer> dropWhileANumberIsGreaterThanFive =
        numbers.stream().dropWhile(number -> number > 5).collect(Collectors.toList());
      out.printf(
        "Numbers that are greater than five are: %s\n",
        dropWhileANumberIsGreaterThanFive
      );
      List<Integer> filterANumberIfItIsLessThanFive =
        numbers.stream().filter(number -> number < 5).collect(Collectors.toList());
      out.printf(
        "Filtered numbers that are less than five: %s\n",
        filterANumberIfItIsLessThanFive
      );
    return;
  }
}