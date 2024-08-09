package com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0002_method_references;

import java.util.logging.Logger;

/**
 * @author ramumsrk
 * @since 0.0.0
 */
public class Main {
  private static final Logger LOGGER =
    Logger.getLogger(com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0002_method_references.Main.class.getName());
  // Java program execution starts
  // from built-in `main()' method
  static public void main(String... args) {
      EmployeeRecordFactory.getListOfEmployeeRecords().stream().filter(employeeRecord -> employeeRecord.employeeSalary() > 10_000).forEach(employeeRecord -> LOGGER.info(String.format("Employee record: '%s'\n",employeeRecord)));
    return;
  }
}
