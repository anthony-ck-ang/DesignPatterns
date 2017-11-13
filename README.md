# DesignPatterns 🔴 ⬜️ 🔴 ⬜️ 🔴 ⬜️ 🔶 ⬜️ 🔶 ⬜️ 🔶 ⬜️ 
Design patterns that I have discovered, understand and seem to find them used frequently in frameworks/libs. 

## 1. Creational Patterns
### 1.1 Factory Method Pattern 🏭 

1.1.1 Intent (Why?)
```
Objective is to create class instances/objects 
without the need to specify their class
through invoking a factory method.
```

1.1.2 Use Case (How?):

- Class cannot expect the type of objects it must create (not known at compile time)
eg: frameworks -> only know about interfaces and abstract classes.

- Class wants it's subclasses to specify the type of objects it creates

- Class needs control over the creation of it's objects 
(limit the number of objects to be created eg: Singleton -> 
it will just return the object that was previously created)

### 1.2 Builder Method Pattern 💪 🏗 

1.2.1 Intent (Why?)
```
Create an object with customisable/multiple attributes.
```

1.2.2 Use Case (How?):

  - Heavy use of "Telescoping pattern" that uses overloaded constructors with different params patterns (order & type).
  - Heavy use of "Javabeans pattern" that uses default constructor + getter & setters.
  - When there are multiple overloading constructors used to create different representation of object.

1.2.3 Cons of Telescoping/Javabeans pattern
  - Need to pass arguments based on constructor's param order.
  - Bad practice.
  - Not thread safe.
  - State of object changes from one to another.
 

1.2.4 Pros of Builder Method
- Client code is easy to read.
- Client knows exactly what they are setting.
- Guide client along the way with handy methods.
- Simplify contruction of object.
- Client need not worry about order of arguments passed into the constructor.
- Thread safe

1.25 Cons of Builder Method
- Duplicate the class’ attributes on the builder.



## 2. Structural Patterns
### 2.1 Adapter Method Pattern 🔌  

### 2.2 Decorator Method Pattern 💠 
2.2.1 Intent (Why?)
```
Requires modification of objects dynamically at runtime
Is an alternative to inheritance.
```

2.2.2 Use case (How?):
- Wants functionality of inheritance using child classes  
- Need to add functionality at run time

2.2.3
Pros of Decorator Method
- More flexible than inheritance
- Can add functionalities using multiple simple classes


## 3. Behavioural Patterns
### 3.1 Strategy Method Pattern 🤔 💭 
3.1.1 Intent (Why?)
```
Allows for switching between different algorithms for accomplishing a task.
eg: Different sorting algorithms for different space (memory) and time tradeoffs.
```
3.1.2 Use case (How?):
- Different  variants of algorithms
- Many different class that differs only in behaviours

3.1.3 Sample code example:

Program takes input:text file and produces output: filtered 

3 different algorithms (behaviours)
- no filter
- Words tt start with 'A'
- Words > 5 chars



```
NOTE ⚠️ ⚠️ ⚠️ 
- User constructor is private -> 
class cannot be directly instantiated from the client code.

- User class is immutable. 
All attributes are final and are set in user constructor using builder object.

- Thread safe as Builder class is a static inner class, 
(does not see or share data with outer class)
thus is not exposed to thread safety issues. 
A thread that uses builder, will create one builder object to use it to create the user object.

- "Javabeans pattern" is not thread safe as the object goes through several set methods (state)
and it may be accessible by other threads while still under going current construction,
resulting in unexpected behavior.
```
