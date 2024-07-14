package com.medium.satishlokhande5674.what_is_a_comparator_in_java;

import java.util.Arrays;
import java.util.List;

public class ListOfPersonRecords {
  public static List<PersonRecord> getListOfPersonRecords() {
    return Arrays.asList(
      new PersonRecord(
        "Father",
        73
      ),
      new PersonRecord(
        "Mother",
        70
      ),
      new PersonRecord(
        "Spouse",
        38
      ),
      new PersonRecord(
        "Child",
        11
      ),
      new PersonRecord(
        "Self",
        43
      )
    );
  }
}