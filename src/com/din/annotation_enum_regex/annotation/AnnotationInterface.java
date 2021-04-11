package com.din.annotation_enum_regex.annotation;

/**
 * Custom Java Annotation
 *
 * Built-In Java Annotations used in Java code
 * @Override
 * @SuppressWarnings
 * @Deprecated
 *
 * Built-In Java Annotations used in in custom annotations in java
 * @Target
 * @Retention
 * @Inherited
 * @Documented
 *
 * There are three types of annotations which is used for custom annotation
 * Marker Annotation   [ @interface MyAnnotation{} ]
 * Single-Value Annotation [ @interface MyAnnotation{ int value(); //or int value() default 0; }  ]
 * Multi-Value Annotation [ @interface MyAnnotation{ int value1() default 1;  String value3() default "xyz"; }
 *                         or  @MyAnnotation(value1=10,value2="Arun Kumar",value3="Ghaziabad")  ]
 *
 */
//@interface AnnotationInterface
public @interface AnnotationInterface {
    String value();
    String name();
    int age();
    String[] newNames();
}
