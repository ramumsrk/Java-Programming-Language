package com.medium.orlandolorenzodeveloper.java_streams_you_wont_regret_learning_them.other_examples.filtering_and_collecting_elements_into_a_new_list;

import java.util.List;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class FilteringAndCollectingElementsIntoANewList {
  public static void main( String[] args ) {
      List<String> listOfNames = List.of(
        "Alice",
        "Bob",
        "Charlie",
        "David",
        "Eva"
      );
      List<String> listOfNamesWithALowerCaseA =
        listOfNames.stream().filter( sampleInputName -> sampleInputName.contains("a")).collect(Collectors.toList());
      out.printf(
        "List of names with a lower-case 'a' in them '%s'\n",
        listOfNamesWithALowerCaseA
      );
    return;
  }
}