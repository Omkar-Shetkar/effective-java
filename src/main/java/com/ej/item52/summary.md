## Item 52: Use overloading judiciously

- The choice of which overloading to invoke is made at compile time
- Selection among overloaded methods is static, while selection among overridden methods is dynamic.

### Avoid confusing uses of overloading

- A safe and conservative approach is never to have two overloadings with the same number of parameters.
- You can always give methods different names instead of overloading them.
- Constructors can't be overridden. Multiple constructors are always overloaded.
- Multiple overloadings with the same number of parameters should not confuse the programmer,
*if* it is always clear which overloading will apply for the given set of actual parameters.
  - This will be true if at least one parameter in the two overloaded methods of same number of parameters,
  is radically of different type.
- Generics and autoboxing have increased the need for caution during overloading.
- Do not overload methods to take different functional interfaces in the same argument position.
- Two distinct classes are said to be *unrelated*, if neither class is descendant of the other.
- If overloading two methods with similar arguments is unavoidable, then ensure that both of the methods have
identical behavior when invoked.
