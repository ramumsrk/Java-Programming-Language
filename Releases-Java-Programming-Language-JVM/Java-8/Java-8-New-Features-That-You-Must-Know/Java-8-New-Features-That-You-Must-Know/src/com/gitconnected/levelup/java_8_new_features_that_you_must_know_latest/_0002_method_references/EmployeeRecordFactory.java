package com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0002_method_references;

import java.util.List;
import java.util.Arrays;

/**
 * @author ramumsrk
 * @since 0.0.0
 */
public class EmployeeRecordFactory {
  /**
   * @return A sequence of employee records
   */
  public static List<EmployeeRecord> getListOfEmployeeRecords() {
    return Arrays.<EmployeeRecord>asList(
      new EmployeeRecord(
        "Vikram",
        25,
        10_000,
        true
      ),
      new EmployeeRecord(
        "Dan",
        24,
        12_000,
        false
      ),
      new EmployeeRecord(
        "John",
        26,
        9_000,
        false
      )
    );
  }
}