# Functional Interfaces & Lambda Expressions in Java 8

## 1. Functional Programming in Java

### What is Functional Programming?

Functional programming is a programming style where programs are written using **functions** and **expressions**, avoiding frequent changes to data (immutability).
The focus is on **what to do** rather than **how to do it**.

### Why Java 8 Introduced Functional Programming Features

Java 8 introduced functional programming concepts to make Java:

* **Shorter** – Less boilerplate code
* **Cleaner** – More readable and expressive
* **Faster** – Better performance using streams and parallelism
* **Modern** – Comparable with modern programming languages

---

## 2. How Java Became Shorter, Cleaner, Faster, and Modern

### Shorter Code

Anonymous classes were replaced by lambda expressions.

**Before Java 8**

```java
new Thread(new Runnable() {
    public void run() {
        System.out.println("Thread running");
    }
}).start();
```

**After Java 8**

```java
new Thread(() -> System.out.println("Thread running")).start();
```

---

### Cleaner Code

Business logic is more visible and easier to understand.

```java
list.forEach(item -> System.out.println(item));
```

---

### Faster Execution

Streams support parallel processing, improving CPU utilization.

```java
list.parallelStream().forEach(System.out::println);
```

---

### More Modern Features

Java 8 introduced:

* Lambda expressions
* Functional interfaces
* Stream API
* Method references
* Optional class

---

## 3. Functional Interface

### Definition

A **functional interface** is an interface that contains:

* **Exactly one abstract method**
* Any number of **default methods**
* Any number of **static methods**

### Why Functional Interfaces Are Needed

* Lambda expressions work **only with functional interfaces**
* A lambda expression needs **one target abstract method** to implement

---

### Example of Functional Interface

```java
@FunctionalInterface
interface Calculator {
    int add(int a, int b);

    default void info() {
        System.out.println("Calculator Interface");
    }

    static void version() {
        System.out.println("Version 1.0");
    }
}
```

### Using Lambda Expression

```java
Calculator c = (a, b) -> a + b;
System.out.println(c.add(10, 20));
```

---

## 4. @FunctionalInterface Annotation

### Is It Mandatory?

No, it is **optional**, but **highly recommended**.

### Why Use @FunctionalInterface?

* Provides **compile-time safety**
* Prevents accidental addition of multiple abstract methods
* Improves readability and intent of the interface

```java
@FunctionalInterface
interface Test {
    void method();
    // void anotherMethod(); // Compile-time error
}
```

---

## 5. Predefined Functional Interfaces in Java

### Runnable Interface

* Method: `run()`
* Used in multithreading

```java
Runnable r = () -> System.out.println("Thread running");
new Thread(r).start();
```

---

### Comparable Interface

* Method: `compareTo(Object o)`
* Used for natural sorting in collections

```java
class Student implements Comparable<Student> {
    int marks;

    public int compareTo(Student s) {
        return this.marks - s.marks;
    }
}
```

---

### Comparator Interface

* Method: `compare(Object o1, Object o2)`
* Used for custom sorting

```java
Comparator<Integer> comp = (a, b) -> b - a;
```

---

## 6. Anonymous Class

### Definition

An **anonymous class** is a class without a name that is:

* Defined and instantiated in **one step**

### When to Use Anonymous Class

* When a class is required only once
* To override a method
* To implement an interface temporarily

```java
Runnable r = new Runnable() {
    public void run() {
        System.out.println("Anonymous class execution");
    }
};
```

---

## 7. Lambda Expressions

### Definition

A **lambda expression** is:

* An anonymous function
* Used to implement a functional interface
* Written without class name, method name, and boilerplate code

---

### Syntax of Lambda Expression

```java
(parameters) -> expression
```

OR

```java
(parameters) -> {
    // multiple statements
}
```

### Example

```java
Runnable r = () -> System.out.println("Lambda running");
```

---

## 8. Limitations of Lambda Expressions

### 1. Cannot Be Used with Abstract Classes

```java
abstract class Test {
    abstract void m1();
}

Test t = () -> {}; // NOT ALLOWED
```

**Reason**
Abstract classes may contain multiple abstract methods, and lambda expressions need exactly one target method.

---

### 2. Cannot Be Used with Normal Classes

* Lambda expressions do not create objects of classes
* They only provide implementation for functional interfaces

---

### 3. Cannot Be Used with Interfaces Having More Than One Abstract Method

```java
interface Test {
    void m1();
    void m2();
}

Test t = () -> {}; // NOT ALLOWED
```

**Reason**
The compiler cannot determine which method the lambda expression should implement.

---

## 9. Final Summary

* Java 8 introduced functional programming features
* Functional programming makes Java shorter, cleaner, faster, and modern
* Functional Interface contains exactly one abstract method
* Lambda expressions work only with functional interfaces
* `@FunctionalInterface` improves safety and readability
* Anonymous classes are verbose; lambda expressions are concise
* Lambda expressions cannot be used with abstract classes, normal classes, or interfaces with multiple abstract methods