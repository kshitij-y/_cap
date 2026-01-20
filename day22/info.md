# Functional Interfaces & Lambda Expressions in Java 8

## 1. Functional Programming in Java

### What is Functional Programming?
Functional programming is a **declarative** programming paradigm. Unlike Object-Oriented Programming (OOP), which focuses on objects and state, functional programming focuses on operations, functions, and immutability.

*   **Imperative (OOP):** Focuses on **HOW** to perform a task (step-by-step state changes).
*   **Declarative (Functional):** Focuses on **WHAT** result is required.

### Why Java 8 Introduced Functional Programming Features
Before Java 8, Java was purely Object-Oriented. Java 8 introduced these concepts to address modern programming needs:

1.  **Conciseness (Shorter):** Reduces "boilerplate" code (repetitive code like anonymous inner classes).
2.  **Readability (Cleaner):** Code expresses the *intent* of the business logic rather than the mechanics of iteration.
3.  **Concurrency (Faster):** Facilitates parallel programming automatically via the **Stream API**.
4.  **Modernization:** Keeps Java competitive with functional languages like Scala, Kotlin, and Python.

---

## 2. Evolution: Shorter, Cleaner, Faster, and Modern

### Shorter Code (Boilerplate Reduction)
The most visible change is the replacement of Anonymous Inner Classes with Lambda Expressions.

**Before Java 8 (Anonymous Class):**
```java
// We have to instantiate an interface and override the method manually
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Thread running inside Anonymous Class");
    }
};
new Thread(r).start();
```

**After Java 8 (Lambda Expression):**
```java
// The compiler infers the interface and method structure
Runnable r = () -> System.out.println("Thread running inside Lambda");
new Thread(r).start();
```

### Cleaner Code (Declarative Style)
Pre-Java 8 required external loops (for-loops). Java 8 uses internal iteration via Streams.

**Imperative Style (Old):**
```java
for(String item : list) {
    if(item.length() > 3) {
        System.out.println(item);
    }
}
```

**Functional Style (New):**
```java
// Reads like English: Filter items length > 3, then print.
list.stream()
    .filter(item -> item.length() > 3)
    .forEach(System.out::println);
```

### Faster Execution (Parallelism)
Functional programming enables the **Stream API** to split data into chunks and process them in parallel threads easily without manual thread management.

```java
// .parallelStream() automatically utilizes multiple CPU cores
list.parallelStream().forEach(item -> processItem(item));
```

---

## 3. Functional Interface (The Core Concept)

### Detailed Definition
A **Functional Interface** (also known as SAM - Single Abstract Method interface) is an interface that contains **exactly one abstract method**.

**Key Rules:**
1.  **Exactly One Abstract Method:** This serves as the target for the Lambda Expression.
2.  **Default Methods:** Allowed (Java 8+). They do not count toward the abstract method limit.
3.  **Static Methods:** Allowed. They do not count toward the limit.
4.  **Object Class Methods:** Methods from `java.lang.Object` (e.g., `toString`, `equals`) are excluded from the count.

### Example of a Valid Functional Interface

```java
@FunctionalInterface
interface Calculator {
    // 1. The Single Abstract Method
    int calculate(int a, int b);

    // 2. Default methods (Ignored by the rule)
    default void printInfo() {
        System.out.println("This is a calculator.");
    }

    // 3. Static methods (Ignored by the rule)
    static void version() {
        System.out.println("v1.0");
    }

    // 4. Object class methods (Ignored by the rule)
    @Override
    String toString(); 
}
```

### Usage with Lambda
```java
Calculator addition = (a, b) -> a + b;
System.out.println(addition.calculate(10, 20)); // Output: 30
```

---

## 4. @FunctionalInterface Annotation

### Is It Mandatory?
No. The annotation is **optional**. If an interface meets the criteria (1 abstract method), the compiler treats it as a functional interface automatically.

### Why Use It?
1.  **Compiler Safety:** It prevents accidental addition of a second abstract method. The compiler will throw an error if the rule is violated.
2.  **Documentation:** It explicitly tells other developers that this interface is intended for Lambdas.

```java
@FunctionalInterface
interface Test {
    void method();
    // void anotherMethod(); // UNCOMMENTING THIS causes a Compilation Error
}
```

---

## 5. Predefined Functional Interfaces (The Big 4)

Java 8 provides the `java.util.function` package so developers don't have to write custom interfaces for common tasks.

### Quick Reference Table

| Interface | Method Signature | Input | Return Type | Usage / Purpose |
| :--- | :--- | :--- | :--- | :--- |
| **Predicate\<T>** | `boolean test(T t)` | 1 (Type T) | `boolean` | **Conditional checks/Filters.** <br> *(e.g., is number even?)* |
| **Function\<T, R>** | `R apply(T t)` | 1 (Type T) | `R` (Result) | **Transformation/Mapping.** <br> *(e.g., convert String to Integer)* |
| **Consumer\<T>** | `void accept(T t)` | 1 (Type T) | `void` | **Consuming data.** <br> *(e.g., printing to console, saving to DB)* |
| **Supplier\<T>** | `T get()` | None | `T` (Result) | **Factory/Generation.** <br> *(e.g., generate random ID)* |
| **UnaryOperator\<T>**| `T apply(T t)` | 1 (Type T) | `T` | Input and Output types are same. |
| **BinaryOperator\<T>**| `T apply(T t1, T t2)`| 2 (Type T) | `T` | Takes two inputs, returns one result (e.g., Sum). |

---

## 6. Anonymous Class vs. Lambda Expressions

While both provide implementations for interfaces, they behave differently under the hood.

### 1. The `this` Keyword (Lexical Scoping)
*   **Anonymous Class:** `this` refers to the **anonymous object itself**.
*   **Lambda Expression:** `this` refers to the **enclosing class instance**. Lambdas do not have their own "identity".

```java
public class ScopeTest {
    public void test() {
        // Anonymous Class
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println(this); // Prints: ScopeTest$1 (The anonymous obj)
            }
        };

        // Lambda
        Runnable r2 = () -> {
            System.out.println(this); // Prints: ScopeTest (The outer class obj)
        };
    }
}
```

### 2. Compilation
*   **Anonymous Class:** Generates a separate `.class` file on disk (e.g., `Main$1.class`).
*   **Lambda:** Does **not** generate a separate class file. It uses the `invokedynamic` instruction, making it more memory efficient.

---

## 7. Lambda Expressions Deep Dive

### Definition
A Lambda expression is an anonymous function (no name, no modifier, no return type declaration) used to implement a Functional Interface.

### Syntax Rules
```java
(parameter_list) -> { method_body }
```

1.  **Parameter Types:** Optional (Type Inference).
    *   `(int a, int b)` can be written as `(a, b)`.
2.  **Parentheses `()`:**
    *   Mandatory for 0 or >1 parameters: `() ->` or `(a,b) ->`.
    *   Optional for exactly 1 parameter: `s ->`.
3.  **Curly Braces `{}`:**
    *   Optional for single-statement bodies.
    *   Mandatory for multiple statements.
4.  **Return Keyword:**
    *   If `{}` is used, explicit `return` is required if the method returns a value.
    *   If `{}` is NOT used, the value is returned automatically.

```java
// Valid Syntax Examples
x -> x * x;                 // Implicit return
(x, y) -> x + y;            // Implicit return
(x, y) -> { return x + y; } // Explicit return required with {}
```

---

## 8. Limitations of Lambda Expressions

1.  **Cannot be used with Abstract Classes:** Lambdas strictly target Interfaces.
2.  **Cannot implement Interfaces with >1 Abstract Method:** The compiler cannot determine which method to map the code to.
3.  **Variable Capture (Effectively Final):** Local variables used inside a lambda must not be modified.
    ```java
    int x = 10;
    Runnable r = () -> System.out.println(x);
    // x = 20; // ERROR: x must be effectively final
    ```

---

## 9. Interview Related Crisp Questions

**Q1: What is the primary difference between a Functional Interface and a Normal Interface?**
> A Functional Interface has exactly one abstract method. A normal interface can have any number of abstract methods.

**Q2: Can a Functional Interface contain Default and Static methods?**
> Yes. The "single abstract method" rule applies only to abstract methods. You can have unlimited default or static methods.

**Q3: What happens if I remove `@FunctionalInterface` from a valid SAM interface?**
> Nothing breaks. The annotation is optional. It is just for compiler safety to prevent accidental addition of more abstract methods.

**Q4: Can a Functional Interface extend another Interface?**
> Yes, as long as the child interface still results in having exactly one abstract method (either inherited or overridden). If it adds a *new* abstract method, it is no longer a Functional Interface.

**Q5: How does the `this` keyword behave differently in Lambdas vs Anonymous Classes?**
> In an Anonymous Class, `this` refers to the anonymous instance. In a Lambda, `this` refers to the outer class instance (lexical scoping).

**Q6: Why are Lambdas considered "lighter" than Anonymous Classes?**
> Lambdas do not generate a separate `.class` file on disk. They use the `invokedynamic` bytecode instruction, which is more memory-efficient.

**Q7: Which interface represents a function that takes a String and returns a Boolean?**
> `Predicate<String>` or `Function<String, Boolean>`. Usually `Predicate` is preferred for conditional checks.

**Q8: Can a Lambda expression throw a Checked Exception?**
> Only if the Functional Interface's abstract method declares that exception in its `throws` clause. Otherwise, you must use a try-catch block inside the Lambda body.
```