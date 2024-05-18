package io.devgenius.com.introduction_to_generics_in_java.Understanding_Generic_Types.Type_Parameters;

public class Box<T> {
  // Member fields
  private T t;
  // Setters or Mutators
  public void set(T t) {
      this.t = t;
    return;
  }
  // Getters or Accessors
  public T get() {
    return this.t;
  }
}
