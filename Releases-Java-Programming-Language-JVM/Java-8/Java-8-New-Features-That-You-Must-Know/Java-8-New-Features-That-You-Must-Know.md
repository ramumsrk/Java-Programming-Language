# [Java 8 — New Features That You Must Know](https://levelup.gitconnected.com/java-8-new-features-that-you-must-know-latest-93a7c9773c43)

#### Paragraph

#### Paragraph

#### Paragraph

# 0001. Interface Default and Static Methods
# 0002. Method References

# 0001. Interface Default and Static Methods

#### Paragraph

#### Paragraph

#### Paragraph

## 0001. 0001. Static Method in an Interface

#### Paragraph

#### Paragraph

#### Paragraph

#### Paragraph

#### Paragraph

## 0001. 0002. Default Method in an Interface

#### Paragraph

#### Paragraph

0001. Item 0001
0002. Item 0002
0003. Item 0003

#### Paragraph

#### Paragraph

#### Paragraph

#### Paragraph

# 0002. Method References:

#### Paragraph

#### Paragraph

#### Paragraph

#### Paragraph

#### Paragraph

# The Method Reference (::) can be used for:

## 0001. Static Method Reference Example:

#### Paragraph

### Lambda Expression:

  ````
  (arguments) -> ClassName.someStaticMethod(arguments)
  ````

### Equivalent Method Reference:

  ````
  ClassName::someStaticMethod
  ````

## 0002. Instance Method Reference Example:

#### Paragraph

### Lambda Expression

  ````
  (object, arguments)->object.instanceMethod(arguments)
  ````

### Equivalent Method Reference:

  ````
  object::instanceMethod
  ````

#### Paragraph

### Lambda expression

  ````
  (arguments)->object.instanceMethod(arguments)
  ````

### Equivalent Method Reference

  ````
  objectType::instanceMethod
  ````

# 0003. Constructor Reference Example

#### Paragraph

### Lambda Expression

  ````
  (arguments) -> new ClassName(arguments)
  ````

### Equivalent Method Reference

  ````
  ClassName::new
  ````
