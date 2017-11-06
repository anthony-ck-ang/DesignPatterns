Factory Method Pattern (WHAT)

Intent (WHY):
Objective is to create class instances/objects 
without the need to specify their class
through invoking a factory method.

Applicability (HOW):
- Class cannot expect the type of objects it must create (not known at compile time)
eg: frameworks -> only know about interfaces and abstract classes.

- Class wants it's subclasses to specify the type of objects it creates

- Class needs control over the creation of it's objects 
(limit the number of objects to be created eg: Singleton -> 
it will just return the object that was previously created)