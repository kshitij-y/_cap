
## **Collection and Framework**

### **Collection (Interface)**

-   `Collection` is the **root interface** of the Java Collection Framework (except `Map`).
    
-   It represents a **group of objects** as a single unit.
    
-   Common methods: `add()`, `remove()`, `size()`, `iterator()`
    

### **Collection Framework**

-   A **standard architecture** in Java for storing and manipulating groups of objects.
    
-   Consists of:
    
    -   Interfaces
        
    -   Classes
        
    -   Algorithms
        
-   Provides reusability, performance, and consistency.


```
Iterable
 └── Collection
     ├── List
     │    ├── ArrayList
     │    ├── LinkedList
     │    └── Vector
     │         └── Stack
     │
     ├── Set
     │    ├── HashSet
     │    ├── LinkedHashSet
     │    └── TreeSet
     │
     └── Queue
          ├── PriorityQueue
          └── LinkedList
```

### List is a interface we cannot create object of List but we can use as a ref varibale

### In all the classess Collection heirarchy `toString()`, `hashCode()`, `equals()`, are already overriden

### In java we have teo types of collection:
- **generic**
- **non- generic**

 
## **List**
- It can store diff type of Object
- It is dynamic in size
- It can maintain insertion order
- It can store duplicate
- it maintains index
- It has random access
- It can store `null` object.

``add(Object obj):``
- It is used to add Object inside list
- return type -> boolean

``size():``

- it used to get size of the list
- return type -> int

```
add(Object obj) returns -> boolean
addAll(Collection)
add(int index, object)
addAll(int index, Object)

remove(object)
remove(int index)
removeAll(Collection)
clear()

contains(object)
containsALl(Collection)

get(int index)
iterator()
listIterator()
for each loop

size()
```

