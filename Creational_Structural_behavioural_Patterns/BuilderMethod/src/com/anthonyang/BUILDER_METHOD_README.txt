Builder Method
Client requirement (example)
  - Create an object with customisable/multiple attributes.

Common solutions
  - "Telescoping pattern" that uses overloaded constructors with different params patterns (order & type).
  - "Javabeans pattern" that uses default constructor + getter & setters.

Cons
  - Need to pass arguments based on constructor's param order.
  - Bad practice.
  - Not thread safe.
  - State of object changes from one to another.
  
Builder Pattern
Use case
- When there are multiple overloading constructors used to create different representation of object.

Pros
Benefit
- Client code is easy to read.
- Client knows exactly what they are setting.
- Guide client along the way with handy methods.
- Simplify contruction of object.
- Client need not worry about order of arguments passed into the constructor.
- Thread safe


Cons
- Duplicate the class’ attributes on the builder.

Note
- User constructor is private -> class cannot be directly instantiated from the client code.
- User class is immutable. All attributes are final and are set in user constructor using builder object. 
- Thread safe as Builder class is a static inner class (does not see or share data with outer class), thus is not exposed to thread safety issues. A thread that uses builder, will create one builder object to use it to create the user object.
- "Javabeans pattern" is not thread safe as the object goes through several set methods (state) and it may be accessible by other threads while still under going current construction, resulting in unexpected behavior.
