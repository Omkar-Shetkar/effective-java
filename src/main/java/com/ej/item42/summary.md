# Item 42: Prefer lambdas to anonymous classes

- From Java 1.1, function objects were created using _anonymous classes_
- They were verbose and hence unappealing
- Come Java 8, replace anonymous classes with _lambda expressions_
- Lambdas implement interfaces with single abstract method which are known as _functional interfaces_
- Lambdas are concise and less verbose
- Types are determined by compiler using _Type Inference_
- Enum types with constant-specific class bodies can be replaced with lambda expressions as fields
- **Lambdas lack names and documentation; if a computation isn't self-explanatory, or exceeds a few lines,
don't put it in a lambda**
- Lambdas in enum constructors can't access instance members of the enum


| Anonymous Classes                                                                             | Lambda Expressions                                                            |
-----------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| You can create an instance of an abstract class or an interface with multiple methods         | Lambdas are limited to functional interfaces                                  |
| If you need access to function object from within its body then anonymous class is the choice | Lambda can't obtain referece to itself. _this_ refers to enclosing interface. |

- Both can't reliably be serialized or deserialized across platforms. For this, prefer
to use _private static_ nested classes.
- **Don't use anonymous classes for function objects unless you have to create instances of
types that aren't functional interfaces**


