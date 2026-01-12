
## Types of Relationships in Java

1.  **HAS-A Relationship**
2.  **IS-A Relationship**
----------

## HAS-A Relationship

Represents **object ownership** or **association**.

### a) Aggregation

-   Weak **HAS-A** relationship
    
-   Child object is created **outside** the parent class
    
-   Child object **can exist independently** of the parent
    

### b) Composition

-   Strong **HAS-A** relationship
    
-   Parent class **creates and owns** the child object
    
-   Child object **cannot exist independently** of the parent
    

----------

## IS-A Relationship

Represents **inheritance** using the `extends` keyword.

----------

## Rules of `super` Calling Statement

1.  `super()` is a **constructor calling statement**  
    Used to call the constructor of the **superclass**
    
2.  `super()` must be the **first statement** inside a constructor
    
3.  If the programmer does not write `super()`,  
    the compiler automatically inserts a **no-argument `super()` call**
    
4.  `this()` and `super()` **cannot be used together**  
    inside the same constructor
    
5.  **Only one** `super()` call is allowed in a constructor
    

----------

## Q1. `super()` vs `this()` Calling Statement

-   `super()` → calls **superclass constructor**
    
-   `this()` → calls **current class constructor**
    

----------

## Types of Inheritance

### 1. Single-Level Inheritance

-   One class inherits from **only one superclass**
    

### 2. Multi-Level Inheritance

-   A class inherits from another class,  
    which itself inherits from another superclass
    
-   Achievable in Java using **classes**
    

### 3. Hierarchical Inheritance

-   One superclass is inherited by  
    **multiple subclasses at the same level**
    

### 4. Hybrid Inheritance

-   Combination of **two or more types of inheritance**
    
-   **Not supported with classes in Java**
    
-   Can be achieved using **interfaces**
    

----------



### Diamond Problem

The diamond problem arises during **multiple inheritance**.

**Reasons:**

1.  Confusion related to the **class loading process**
    
2.  Confusion related to the **object creation/loading process**
    
3.  Confusion with respect to **accessing class members**
    

----------

### Typecasting

#### 1. Upcasting
-   Creating an object of a **subclass** and storing it in a **superclass reference**
-   Only **superclass methods** can be accessed using the reference
-   Overridden methods execute based on the **runtime (subclass) object**

#### 2. Downcasting
-   Converting a **superclass reference** into a **subclass reference**
-   Allows access to **both superclass and subclass members**
-   Requires **explicit typecasting**

### Types of Polymorphism
#### 1. Compile-Time Polymorphism
-   Binding happens at **compile time**
-   Also called **Static Binding**
-   Achieved using:
    1.  **Method Overloading**
    2.  **Constructor Overloading**
    3.  **Variable Shadowing**
        - a subclass ans superclass having variable with same name
        - which varibale to be called is decided during complie time based on ref var type
    4.  **Method Shadowing**

#### 2. Run-Time Polymorphism
-   Binding happens at **runtime**
-   Also called **Dynamic Binding**
-   Achieved using:
    1.  **Method Overriding**
        - a subcass and superclass having static method with same name, same access modifier, same return type ans same formal argument
-   Requires:
    -   **Inheritance**
    -   **Upcasting**
    -   **Overridden methods**
-   Annotation : extra validation provided by programmer.
    ```java
    @Override
    ```
