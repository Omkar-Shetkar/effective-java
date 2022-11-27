# Item 44: Favor the use of standard functional interfaces

- If one of the standard functional interfaces does the job, you should generally use 
it in preference to a purpose-built functional interface.

Interface | Function Signature | Example             |
--------- |--------------------|---------------------|
UnaryOperator<T> | T apply(T t)       | String::toLowerCase |
BinaryOperator<T> | T apply(T t1, Tt2) | BigInteger::add     |
Predicate<T> | boolean test(T t)  | Collection::isEmpty |
Function<T, R> | R apply(T t)       | Arrays::asList      |
Supplier<T> | T get()            | Instant::now        |
Consumer<T> | void accept(T t)   | System.out::println |

- Don't be tempted to use basic functional interfaces with boxed primitives instead of
primitive functional interfaces.
- You should prefer to write custom functional interface in preference to using a standard one only if
  - It will be commonly used and could benefit from a descriptive name.
  - It has a strong contract associated with it.
  - It would benefit from custom default methods.
- Always annotate your functional interfaces with the `@FunctionalInterface` annotation.
- Do not provide a method with multiple overloadings that take different functional
interfaces in the same argument position if it could create a possible ambiguity in
the client.

```mermaid
graph LR

  uop(UnaryOperator<T>)
  bop(BinaryOperator<T>)
  pre(Predicate<T>)
  fun(Function<T,R>)
  sup(Supplier<T>)
  con(Consumer<T>)
  
  uop --> intuop(IntUnaryOperator)
  uop --> longuop(LongUnaryOperator)
  uop --> doubleuop(DoubleUnaryOperator)
  
  bop --> intbop(IntBinaryOperator)
  bop --> longbop(LongBinaryOperator)
  bop --> doublebop(DoubleBinaryOperator)
  
  pre --> intpre(IntPredicate)
  pre --> longpre(LongPredicate)
  pre --> doublepre(DoublePredicate)
  
  fun --> intfun(IntFunction<R>)
  fun --> longfun(LongFunction<R>)
  fun --> doublefun(DoubleFunction<R>)
  fun --> prim(Primitives)
  prim --> longint(LongToIntFunction)
  fun --> twoargfun(Two Argument Function Primitive Retrurn)
  twoargfun --> intbifunction
  
  sup --> intsup(IntSupplier)
  sup --> longsup(LongSupplier)
  sup --> doublesup(DoubleSupplier)
  
  con --> intcon(IntConsumer)
  con --> longcon(LongConsumer)
  con --> doublecon(DoubleConsumer)
  con --> twoargcon(Two Argument with Primitve Consumer)
  twoargcon --> doubleconsumer
  
  subgraph Primitives
    longint(LongToIntFunction)
    longdouble(LongToDoubleFunction)
    intlong(IntToLongFunction)
    intdouble(IntToDoubleFunction)
    doubleint(DoubleToIntFunction)
    doublelong(DoubleToLongFunction)
    doubleobj(DoubleToObjFunction???)
    intobj(IntToObjFunction???)
    longobj(LongToObjFunction???)
  end
  
  subgraph Two Argument
    bipredicate(BiPredicate<T,U>)
    bifunction(BiFunction<T,U,R>)
    biconsumer(BiConsumer<T,U>)
  end
  
  subgraph Two Argument Function Primitive Return
    intbifunction(ToIntBiFunction<T,U>)
    longbifunction(ToLongBiFunction<T,U>)
    doublebifunction(ToDoubleBiFunction<T,U>)
  end
  
  subgraph Two Argument with Primitve Consumer
    doubleconsumer(ObjDoubleConsumer<T>)
    intconsumer(ObjIntConsumer<T>)
    longconsumer(ObjLongConsumer<T>)
  end
  
  subgraph Boolean Supplier
    booleansupplier(BooleanSupplier)
  end
  
```

