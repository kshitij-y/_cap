
## Object Class (Java)

### 1. General Points

-   `Object` class is defined in the **java.lang** package.
    
-   It is the **supermost class** in Java.
    
-   Every Java class **indirectly inherits** from `Object`.
    
-   Enables:
    
    -   Runtime polymorphism
        
    -   Generic handling of objects
        

----------

## Object Class Methods

`Object` class contains **11 non-static methods**:

1.  `toString()`
    
2.  `hashCode()`
    
3.  `equals(Object obj)`
    
4.  `finalize()`
    
5.  `getClass()`
    
6.  `clone()`
    
7.  `wait()`
    
8.  `wait(long l)`
    
9.  `wait(long l, int i)`
    
10.  `notify()`
    
11.  `notifyAll()`
    

----------

## Important Methods (Short Notes)

### 1. `toString()`

-   **Return type:** `String`
    
-   Returns string representation of an object
    
-   Called **automatically** when an object is printed
    
-   Default implementation returns:  
    `ClassName@hashCode`
    

----------

### 2. `equals(Object obj)`

-   **Return type:** `boolean`
    
-   Used to compare **content** of objects
    
-   Default implementation compares **references**
    

----------

### 3. `hashCode()`

-   **Return type:** `int`
    
-   Generates an integer value for the object
    
-   Used by **HashMap, HashSet**
    

📌 **Important Rule**  
If `equals()` is overridden, `hashCode()` **must also be overridden**

----------

### 4. `getClass()`

-   **Return type:** `Class<?>`
    
-   Returns runtime class information
    
-   Used in reflection
    

----------

### 5. `clone()`

-   Used to create a **duplicate object**
    
-   Performs **shallow copy**
    
-   Class must implement **Cloneable** interface
    

----------

### 6. `wait()`, `notify()`, `notifyAll()`

-   Used for **inter-thread communication**
    
-   Available because `Object` is superclass of all classes
    
-   Must be called inside a **synchronized block**


### Why do we need to override toString() method?
- to print data of the Object rather than printing adress of the object

### Why do we need to override equals() method ?
- to compare data of an Object rather than comparing address