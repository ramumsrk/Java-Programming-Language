package com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0001_interace_default_and_static_methods._0001_0002_default_method_in_an_interface;

import com.gitconnected.levelup.java_8_new_features_that_you_must_know_latest._0001_interace_default_and_static_methods._0001_0001_static_methods_in_an_interface.Shape;

/**
 * @author ramumsrk
 * @since 0.0.0
 */
public class Square implements Shape {
  /**
   * @param side Length of side of a Square
   */
  public Square(final float side) {
      this.side = side;
    return;
  }
  /**
   * Length of side of a square
   */
  private final float side;
  /**
   * @return Calculated area of a square
   */
  @Override
  public float calculateArea() {
    return this.side * this.side;
  }
}
