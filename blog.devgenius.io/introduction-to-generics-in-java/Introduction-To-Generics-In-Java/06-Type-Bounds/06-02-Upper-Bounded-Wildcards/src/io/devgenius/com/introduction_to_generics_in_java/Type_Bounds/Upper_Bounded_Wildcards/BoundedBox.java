package io.devgenius.com.introduction_to_generics_in_java.Type_Bounds.Upper_Bounded_Wildcard;

public class BoundedBox<T extends Number> {
  // Member fields
  private T t;
  // Member functions
  // Accessors or Getters
  public T get() {
    return this.t;
  }
  // Mutators or Setters
  public void set(T t) {
      this.t = t;
    return;
  }
}
