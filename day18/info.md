## Write a diff between for and for-each loop
### for:
- full control over Index
- can interate forward and backword
- can modify loop counter

### for-each:
- No index access
- Fixed Interation Order
- Cannot skip or jump

## Iterator
- it is a cursor, it is s interface
- to activate iterator cursor in collection we have iterator() method.
- the return type of iterator() is Iterator Interface.
- with the help of this method we can access `hasNext()`, `next()`, `remove()` methods

### **hasNext()**
- it is used to check whether next object is present or not.
### **next()**
- It is used to return next object of iterator
- return type is Object
### **remove()**
- It is used to remove the previous object of iteration.
- we can use `remove` after `next()` method.
- if used before `next()` it will give `IllegalStateException`
- return type void

## ListIterator

-   `ListIterator` is a **bidirectional iterator**
-   Available only for `List` implementations
-   Extends the `Iterator` interface
-   Allows traversal in **both directions**
-   Supports element modification during iteration
    

### Additional methods:
-   `hasPrevious()`
-   `previous()`
-   `nextIndex()`
-   `previousIndex()`
-   `add(E e)`
-   `set(E e)`



# Vector
-   It is a implementing class of List interface.
-	It is present inside jav.util package
-	It is known as legacy class .
-	It present since jdk 1.0v
-	It follows dynamic array datastructure.
-	Objects of vectors are stored in continious block of memory


# Stack : 
-	It is a subclass of vector 
-	It is a implemention class List
-	It is present inside java.util package
-	It is present since jdk 1.0v
-	hench it is also known as legacy class
-	It follows Fist In Last Out / Last In First Out insertion order
-	It is used to perform stack operation.

- To perform stack operation we have multiple methods in Stack class.

### push(Object obj) :
-	It is used to push object inside the stack.
-	The return type is Object
### peek() : 
-	It is used to return top object of the stack.
-	return type is Object.
-	When stack empty and if we try to use peek method then it will throw EmptyStackException

### pop() :
-	It is used to return and remove the top element of the stack.
-	return type is Object.
-	When stack is empty and if try to use pop method then it will throw EmptyStackException

### empty() :
-	It is used to check whether the stack is empty or not.
-	returntype is boolean.
