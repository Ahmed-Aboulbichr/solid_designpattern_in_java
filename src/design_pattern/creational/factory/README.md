
# Factory Design Pattern

- Factory design pattern helps to create loosely coupled OOP design.
- There is a fundamental problem with the __new__ keyword.

__```We should favor abstraction (supertypes) instead of concrete implementations```__

- Whenever we use the __new keyword__ (and instantiate a class) we definitely violate this principle.
  -Tying our code to concrete classes makes the application less flexible and more fragile