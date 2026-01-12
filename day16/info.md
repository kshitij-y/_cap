
## Exception in Java

### What is an Exception?

An **exception** is a problem that occurs **at runtime**, which disrupts the normal flow of a program and may cause program termination if not handled.

----------

## Exception Hierarchy in Java

```
Throwable
│
├── Error
│   ├── VirtualMachineError
│   │   ├── StackOverflowError
│   │   └── OutOfMemoryError
│
└── Exception
    ├── Checked Exceptions
    │   ├── IOException
    │   │   └── FileNotFoundException
    │   ├── SQLException
    │   ├── ClassNotFoundException
    │   ├── InterruptedException
    │   └── CloneNotSupportedException
    │
    └── Unchecked Exceptions (RuntimeException)
        ├── ArithmeticException
        ├── NullPointerException
        ├── ClassCastException
        ├── InputMismatchException
        ├── IndexOutOfBoundsException
        │   ├── ArrayIndexOutOfBoundsException
        │   └── StringIndexOutOfBoundsException
```


## Error

-   Serious problems that **should not be handled** by the program.
    
-   Occur due to **JVM or system failure**.
    
-   Example:
    
    -   `StackOverflowError`
        
    -   `OutOfMemoryError`
        

----------

## Exception

-   Problems that **can be handled** by the program.
    
-   Caused by **logic errors, invalid input, or external resources**.
    

----------

## Checked Exceptions

-   Checked **at compile time**.
    
-   Must be handled using `try-catch` or `throws`.
    
-   Examples:
    
    -   `IOException`
        
    -   `FileNotFoundException`
        
    -   `SQLException`
        
    -   `ClassNotFoundException`
        

----------

## Unchecked Exceptions (RuntimeException)

-   Checked **at runtime**.
    
-   Caused by **programming mistakes**.
    
-   Compiler does **not force handling**.
    
-   Examples:
    
    -   `NullPointerException`
        
    -   `ArithmeticException`
        
    -   `ArrayIndexOutOfBoundsException`


### Exception Flow in Java
-   When the **normal flow of a program is disrupted**, an **Exception object is created**
-   The Exception object contains:
    -   **Type** of exception
    -   **Description / message**
    -   **Line number** where the exception occurred
-   JVM searches for a **matching Exception Handler (`try-catch`)**
-   If a handler **is found**:
    -   The exception is handled
    -   Program **continues execution after the try–catch block**
-   If a handler **is not found**:
    -   JVM prints the **stack trace**
    -   Program **terminates abnormally**