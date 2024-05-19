package com.gitconnected.levelup.custom_annotation_in_java_everything_you_need_to_know_2023_updated.how_to_create_custom_annotations.step_02_how_to_use_our_custom_annotation;

import com.gitconnected.levelup.custom_annotation_in_java_everything_you_need_to_know_2023_updated.how_to_create_custom_annotations.step_01_how_to_define_our_custom_annotation.MyCustomAnnotation;

@MyCustomAnnotation(
  description = "This annotation is applicable to type class",
  priority = 2
)
public class ExampleClass {
  @MyCustomAnnotation(
    description = "This annotation is applicable to a method",
    priority = 3
  )
  public void exampleMethod() {}
}
