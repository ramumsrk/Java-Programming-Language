package com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0001_interace_default_and_static_methods._0001_0001_static_methods_in_an_interface;

import java.util.logging.Logger;

/**
 * @author ramumsrk
 * @since 0.0.0
 */
public /*abstract*/ interface Shape {
  /**
   * @return Calculated area
   */
  public abstract float calculateArea();

  /**
   * @param calculatedArea Calculated area of a shape
   */
  static void printArea(float calculatedArea) {
      LOGGER.info(String.format("Calculated area: '%f'\n", calculatedArea));
    return;
  }
  /**
   *
   */
  public static final Logger LOGGER =
    Logger.getLogger(com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0001_interace_default_and_static_methods._0001_0001_static_methods_in_an_interface.Shape.class.getName());

  /**
   * @param shapeType Type of shape being printed
   */
  default void printShapeType(String shapeType) {
      LOGGER.info(String.format("Shape of type is: '%s'\n", shapeType));
    return;
  }
}