package com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0001_interace_default_and_static_methods._0001_0002_default_method_in_an_interface;

import com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0001_interace_default_and_static_methods._0001_0001_static_methods_in_an_interface.Shape;

import java.util.logging.Logger;

/**
 * @author ramumsrk
 * @since 0.0.0
 */
public class Main {
  /**
   *
   */
  private static final Logger LOGGER =
    Logger.getLogger(com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0001_interace_default_and_static_methods._0001_0002_default_method_in_an_interface.Main.class.getName());
  // Java program execution starts from
  // built-in `main()' method
  public static void main(String... args) {
      Shape squareShape = new Square(2.0F);
      squareShape.printShapeType("Square");
      LOGGER.info(String.format("Area of square is '%f'\n",
        squareShape.calculateArea()));
    return;
  }
}
