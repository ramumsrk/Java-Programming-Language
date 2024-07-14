package com.medium.satishlokhande5674.what_is_a_comparator_in_java;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;

public class ComparatorDemo {
  private static final Logger LOGGER =
    Logger.getLogger(ComparatorDemo.class.getName()
    );
  static public void main(String... args) {
      List<PersonRecord> listOfPersonRecords =
        ListOfPersonRecords.<PersonRecord>getListOfPersonRecords();
          Comparator<PersonRecord> personRecordPersonAgeComparator =
        (PersonRecord personRecord, PersonRecord anotherPersonRecord) -> {
          /*
           * The value 0 indicates that ages of both the
           * persons are same
           * <code>personRecord.personAge() == anotherPersonRecord.personAge
           * ()</code>
           */
          int returnValue = 0;
          if (personRecord.personAge() > anotherPersonRecord.personAge()) returnValue = 1;
          else if (personRecord.personAge() < anotherPersonRecord.personAge()) returnValue = -1;
        return returnValue;
        };
      LOGGER.info(
        String.format(
          "%s\n",
          "Before sorting"
        )
      );
      for (var aPersonRecord : listOfPersonRecords) {
        LOGGER.info(
          String.format(
            "%s\n",
            aPersonRecord
          )
        );
      }
      Collections.sort(
        listOfPersonRecords,
        personRecordPersonAgeComparator
      );
      LOGGER.info(
        String.format(
          "%s\n",
          "After sorting"
        )
      );
      for (var aPersonRecord : listOfPersonRecords) {
        LOGGER.info(
          String.format(
            "%s\n",
            aPersonRecord
          )
        );
      }
    return;
  }
}