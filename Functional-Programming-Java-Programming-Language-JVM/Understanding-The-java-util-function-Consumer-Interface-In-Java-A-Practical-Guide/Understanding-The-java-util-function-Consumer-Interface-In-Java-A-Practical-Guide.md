# [Understanding The java.util.function.Consumer Interface In Java A Practical Guide](https://medium.com/@ak123aryan/understanding-the-consumer-interface-in-java-a-practical-guide-1e5d50337eb7)

[Akshay Aryan](https://medium.com/@ak123aryan)

### Paragraph

### Paragraph

## 1. What Is The _java.util.function.Consumer<T>_ Interface?

### Paragraph

### Paragraph

## 2. Using _java.util.function.Consumer_ With Lambda Expressions

### Paragraph

### Paragraph

  ````
  java.util.function.Consumer<String> consumer = (String string) -> System.out.printf("%s\n", string);
  consumer.accept("Hello, World!");
  ````

### Paragraph

## 3. Method References Even Cleaner Code

### Paragraph

### Paragraph

  ````
  java.util.function.Consumer<String> consumer = System.out::printf;
  consumer.accept("Hello, World!");
  ````

### Paragraph

## 4. Chaining Consumers Do More In Less Code

### Paragraph

### Paragraph

  ````
  java.util.function.Consumer<String> toUpperCaseConsumer = (String string) -> System.out.printf("%s\n",string.toUpperCase());
  java.util.function.Consumer<String> toLowerCaseConsumer = (String string) -> System.out.printf("%s\n",string.toLowerCase());
  toUpperCaseConsumer.andThen(toLowerCaseConsumer).accept("Hello, World!");
  ````

### Paragraph

## 5. Consumers In The Real World Streams

### Paragraph

### Paragraph

  ````
  java.uti.Arrays.asList("Alice", "Bob", "Charlie").forEach(System.out::printf);
  ````

### Paragraph

## 6. A Practical Example Logging System

### Paragraph

### Paragraph

### Paragraph

## 7. Wrapping Up

### Paragraph

### Paragraph
