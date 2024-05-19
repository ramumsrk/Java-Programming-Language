package com.gitconnected.levelup.custom_annotation_in_java_everything_you_need_to_know_2023_updated.how_to_create_custom_annotations.step_03_how_to_retrieve_annotation_values_at_runtime;

import com.gitconnected.levelup.custom_annotation_in_java_everything_you_need_to_know_2023_updated.how_to_create_custom_annotations.step_01_how_to_define_our_custom_annotation.MyCustomAnnotation;
import com.gitconnected.levelup.custom_annotation_in_java_everything_you_need_to_know_2023_updated.how_to_create_custom_annotations.step_02_how_to_use_our_custom_annotation.ExampleClass;

import java.lang.reflect.Method;

import static java.lang.System.out;

public class TestAnnotation {
  static public void main( String... args ) {
      Class<ExampleClass> exampleClass = ExampleClass.class;
      MyCustomAnnotation myCustomAnnotation =
        exampleClass.getAnnotation(MyCustomAnnotation.class);
      out.printf(
        "Class annotation description: %s\n",
        myCustomAnnotation.description()
      );
      out.printf(
        "Class annotation priority: %s\n",
        myCustomAnnotation.priority()
      );

      try {
        Method method = exampleClass.getMethod("exampleMethod");
        MyCustomAnnotation methodAnnotation =
          method.getAnnotation(MyCustomAnnotation.class);
        out.printf(
          "Method annotation description: %s\n",
          methodAnnotation.description()
        );
        out.printf(
          "Method annotation priority: %s\n",
          methodAnnotation.priority()
        );
      } catch ( NoSuchMethodException noSuchMethodException ) {
        noSuchMethodException.printStackTrace();
      }
    return;
  }
}