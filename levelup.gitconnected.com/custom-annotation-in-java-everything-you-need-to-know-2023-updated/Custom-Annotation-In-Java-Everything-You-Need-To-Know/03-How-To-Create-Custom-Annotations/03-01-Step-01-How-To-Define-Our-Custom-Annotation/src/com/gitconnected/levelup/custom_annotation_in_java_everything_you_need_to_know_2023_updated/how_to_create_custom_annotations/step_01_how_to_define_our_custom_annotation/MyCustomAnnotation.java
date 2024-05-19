package com.gitconnected.levelup.custom_annotation_in_java_everything_you_need_to_know_2023_updated.how_to_create_custom_annotations.step_01_how_to_define_our_custom_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Availability of this annotation
@Retention(
  RetentionPolicy.RUNTIME
)
// Applicability of this annotation
@Target(
  {
    ElementType.TYPE,
    ElementType.METHOD
  }
)
public @interface MyCustomAnnotation {
  // Optional annotation elements
  String description() default "";
  int priority() default 1;
}
