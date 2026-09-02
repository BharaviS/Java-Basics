# Java Basics

A collection of Java programs and exercises created while learning and strengthening **Core Java fundamentals**.

This repository starts with simple Java programs and gradually introduces programming concepts such as methods, loops, conditional statements, exception handling, `Scanner`, and `StringBuilder`.

---

## Index

1. [Hello World Program](#1-hello-world-program)
2. [Basic FizzBuzz Program](#2-basic-fizzbuzz-program)
3. [FizzBuzz Program Using Methods](#3-fizzbuzz-program-using-methods)
4. [FizzBuzz Program Using a Separate Class](#4-fizzbuzz-program-using-a-separate-class)

---

## 1. Hello World Program

The **Hello World** program is the basic starting point for learning Java.

It demonstrates:

- Java class structure
- The `main()` method
- Console output using `System.out.println()`

**Source:** [`Exercise1/HelloWorld.java`](https://github.com/BharaviS/Java-Basics/blob/main/Exercise1/HelloWorld.java)

---

## 2. Basic FizzBuzz Program

The **FizzBuzz** program is a simple exercise used to practice:

- `for` loops
- `if`, `else if`, and `else`
- Modulo operator `%`
- Conditional logic
- Console input using `Scanner`

The program evaluates numbers sequentially and prints:

- `Fizz` when the number is divisible by `3`
- `Buzz` when the number is divisible by `5`
- `FizzBuzz` when the number is divisible by both `3` and `5`
- The number itself when none of the conditions match

**Source:** [`Exercise1/FizzBuzz.java`](https://github.com/BharaviS/Java-Basics/blob/main/Exercise1/FizzBuzz.java)

---

## 3. FizzBuzz Program Using Methods

This version improves the basic FizzBuzz implementation by moving the core logic into a separate method:

```java
public static String getFizzBuzz(int iterations)
```

This demonstrates an important Java concept: **separating program logic into reusable methods**.

### Concepts Covered

- Methods
- Method parameters
- Return values
- `StringBuilder`
- `for` loops
- Conditional statements
- Modulo operator `%`
- `String.valueOf()`
- `Scanner`
- `try-with-resources`
- Exception handling
- Input validation

### Program Flow

The program follows this basic flow:

```text
User Input
    ↓
getFizzBuzz(iterations)
    ↓
Loop from 1 to iterations
    ↓
Check divisibility
    ↓
Fizz / Buzz / FizzBuzz / Number
    ↓
Append result to StringBuilder
    ↓
Return complete String
    ↓
Print result
```

### Source Code

**Source:** [`Exercise1/FizzBuzzMethods.java`](https://github.com/BharaviS/Java-Basics/blob/main/Exercise1/FizzBuzzMethods.java)

### Example

For an input of:

```text
15
```

The output will be:

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

### Key Method

```java
public static String getFizzBuzz(int iterations) {

    StringBuilder result = new StringBuilder();

    for (int i = 1; i <= iterations; i++) {

        String items;

        if (i % 3 == 0 && i % 5 == 0) {
            items = "FizzBuzz";
        } else if (i % 3 == 0) {
            items = "Fizz";
        } else if (i % 5 == 0) {
            items = "Buzz";
        } else {
            items = String.valueOf(i);
        }

        result.append(items).append("\n");
    }

    return result.toString();
}
```

The method accepts the number of iterations, processes the FizzBuzz logic, builds the complete result using `StringBuilder`, and returns it as a `String`.

---
## 4. FizzBuzz Program Using a Separate Class

This version introduces the concept of **separating responsibilities into different classes**.

The FizzBuzz logic is moved from the `OopFizzBuzz` class into a separate `MyFizzBuzz` class.

### Concepts Covered

* Multiple classes
* Class-level (`static`) methods
* Calling methods from another class
* Method parameters
* Return values
* `StringBuilder`
* `for` loops
* Conditional statements
* Modulo operator `%`
* `Scanner`
* `try-with-resources`
* Exception handling
* Input validation

### Program Structure

The program contains two classes:

```text
OopFizzBuzz
│
└── main()
      │
      ├── Read user input
      │
      └── MyFizzBuzz.getFizzBuzz()
                    │
                    └── Process FizzBuzz
```

### `MyFizzBuzz` Class

The `MyFizzBuzz` class contains the FizzBuzz processing logic:

```java
class MyFizzBuzz {

    public static String getFizzBuzz(int iterations) {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= iterations; i++) {

            String items;

            if (i % 3 == 0 && i % 5 == 0) {
                items = "FizzBuzz";
            } else if (i % 3 == 0) {
                items = "Fizz";
            } else if (i % 5 == 0) {
                items = "Buzz";
            } else {
                items = String.valueOf(i);
            }

            result.append(items).append("\n");
        }

        return result.toString();
    }
}
```

The `OopFizzBuzz` class then calls the method:

```java
System.out.println(MyFizzBuzz.getFizzBuzz(a));
```

### Important OOP Note

Although this exercise introduces **multiple classes**, it does **not yet demonstrate object creation**.

The method is declared as:

```java
public static String getFizzBuzz(int iterations)
```

Because it is `static`, it belongs to the **class itself**, so an object is not required.

Therefore, this exercise is better understood as:

> **Separating functionality into a separate class using a static method.**

A true object-oriented implementation will be introduced in the next exercise using:

```java
MyFizzBuzz fizzBuzz = new MyFizzBuzz();
```

and an **instance method** instead of a `static` method.

### Source Code

**Source:** [`Exercise1/OopFizzBuzz.java`](https://github.com/BharaviS/Java-Basics/blob/main/Exercise1/OopFizzBuzz.java)

### Example

For an input of:

```text
15
```

The output will be:

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

---

## Learning Progress

| Exercise | Concepts |
|---|---|
| Hello World | Class, `main()`, console output |
| Basic FizzBuzz | Loops, conditions, `%`, `Scanner` |
| FizzBuzz Using Methods | Methods, return values, `StringBuilder`, exception handling |

---

## Repository Structure

```text
Java-Basics/
│
├── Exercise1/
│   ├── HelloWorld.java
│   ├── FizzBuzz.java
│   ├── FizzBuzzMethods.java
│   └── OopFizzBuzz.java
│
└── README.md
```

---

## Goal

The goal of this repository is to build a strong foundation in **Core Java** before progressing toward more advanced Java development topics.

Future exercises will progressively cover:

- Variables and Data Types
- Operators
- Control Flow
- Methods
- Arrays
- Strings
- Object-Oriented Programming
- Collections
- Exception Handling
- Generics
- File I/O
- Streams
- Multithreading
- Modern Java Features
- JavaFX
- Spring Boot

---

**Author:** [Bharavi S](https://github.com/BharaviS)

**Repository:** [Java-Basics](https://github.com/BharaviS/Java-Basics)