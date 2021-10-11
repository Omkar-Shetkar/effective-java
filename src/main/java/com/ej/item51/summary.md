# Item 51: Design method signatures carefully

- **Choose method names carefully**
  - Consistent with other names in the package
  - Consistent with the broader consensus
  

- **Don't go overboard in providing convenience methods**
  - Every method should "pull its weight"
  - Each action supported by class should have corresponding method
  - Consider providing "shorthand" only if it will be used often. When in doubt, leave it out.
  

- **Avoid long parameter lists**
  - Aim for <= 4 parameters
  - To avoid long sequence of identically typed parameters
    - Break the method up into multiple methods, each of which requires only a subset of the parameters.
    - Create helper classes to hold groups of parameters.
    - Adapt the Builder pattern from object construction to method invocation.


- **For parameter types, favor interfaces over classes**


- **Prefer two-element enum types to boolean parameters**