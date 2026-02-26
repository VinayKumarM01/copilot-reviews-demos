# Java Documentation Format Guide

This document defines the Javadoc conventions for this project. All public and protected classes, interfaces, fields, and methods must be documented.

---

## Table of Contents

1. [Class Documentation](#class-documentation)
2. [Method Documentation](#method-documentation)
3. [Common Tags Reference](#common-tags-reference)
4. [Examples](#examples)

---

## Class Documentation

Place the Javadoc comment immediately above the class declaration. A class doc must:

- Start with a **one-sentence summary** ending with a period.
- Optionally follow with a more detailed paragraph separated by a blank line.
- Use `@author` to identify the primary author.
- Use `@version` to record the current version.
- Use `@since` to note the version or date the class was introduced.

**Template**

```java
/**
 * Brief one-sentence summary of what this class does.
 *
 * <p>Optional additional detail: explain the purpose, responsibilities,
 * and any important design decisions or constraints.
 *
 * @author  Your Name
 * @version 1.0
 * @since   1.0
 */
public class MyClass {
    // ...
}
```

**Rules**

- Do **not** document implementation details that are obvious from the code.
- Do document **why** something exists if the reason is not immediately clear.
- Avoid starting with "This class …"; describe what it *is* or *does* directly.

---

## Method Documentation

Place the Javadoc comment immediately above the method signature. A method doc must:

- Open with a **one-sentence description** of what the method does (not how).
- Document **every parameter** with `@param`.
- Document the **return value** with `@return` (omit for `void` methods).
- Document **every checked exception** with `@throws`; include unchecked exceptions when the caller must be aware of them.

**Template**

```java
/**
 * Brief one-sentence description of what this method does.
 *
 * <p>Optional additional detail for complex behaviour, side effects,
 * or preconditions the caller must satisfy.
 *
 * @param  paramName  description of this parameter and valid values/ranges
 * @param  otherParam description of this parameter
 * @return            description of the return value; omit for void methods
 * @throws IllegalArgumentException if {@code paramName} violates a constraint
 * @throws NullPointerException     if {@code paramName} is {@code null}
 */
public ReturnType methodName(Type paramName, Type otherParam) {
    // ...
}
```

**Rules**

- Write `@param` entries in the same order as the parameter list.
- Start each `@param`/`@return`/`@throws` description in lower-case (it continues the implicit sentence).
- Use `{@code value}` for inline code references (e.g. `{@code null}`, `{@code true}`).
- Use `{@link ClassName#method}` to cross-reference related types or methods.
- Do **not** document trivial getters/setters unless the semantics are non-obvious.

---

## Common Tags Reference

| Tag | Applies to | Purpose |
|---|---|---|
| `@author` | Class/Interface | Identifies the primary author |
| `@version` | Class/Interface | Current version of the class |
| `@since` | Class, Method, Field | Version or date the element was added |
| `@param name desc` | Method/Constructor | Documents a parameter |
| `@return desc` | Method | Documents the return value |
| `@throws Type desc` | Method/Constructor | Documents a thrown exception |
| `@deprecated desc` | Any | Marks the element as deprecated with a migration note |
| `{@code text}` | Inline | Renders text in monospace without HTML escaping |
| `{@link Ref}` | Inline | Inserts a hyperlink to another element |
| `{@inheritDoc}` | Method | Copies the Javadoc from the overridden method |

---

## Examples

### Documented Class

```java
/**
 * Performs basic arithmetic operations on integer operands.
 *
 * <p>All operations return an {@code int} result. Callers are responsible
 * for avoiding integer overflow.
 *
 * @author  Jane Doe
 * @version 1.0
 * @since   1.0
 */
public class Calculator {
    // ...
}
```

### Documented Method — with parameters and return value

```java
/**
 * Returns the sum of two integers.
 *
 * @param  a  the first addend
 * @param  b  the second addend
 * @return    the sum {@code a + b}
 */
public int add(int a, int b) {
    return a + b;
}
```

### Documented Method — with exception

```java
/**
 * Divides {@code dividend} by {@code divisor}.
 *
 * @param  dividend  the value to be divided
 * @param  divisor   the value to divide by; must not be zero
 * @return           the integer quotient of the division
 * @throws IllegalArgumentException if {@code divisor} is zero
 */
public int divide(int dividend, int divisor) {
    if (divisor == 0) {
        throw new IllegalArgumentException("Divisor must not be zero.");
    }
    return dividend / divisor;
}
```

### Deprecated Method

```java
/**
 * Multiplies two integers.
 *
 * @param  a  the first factor
 * @param  b  the second factor
 * @return    the product {@code a * b}
 * @deprecated Use {@link #multiply(int, int)} instead, which handles overflow correctly.
 */
@Deprecated
public int mul(int a, int b) {
    return a * b;
}
```
