# Java Practice

A collection of Java coding exercises, interview questions, and company-specific challenges completed for learning, interview preparation, and problem-solving practice.

## Purpose

This repository contains:

- Core Java practice problems
- String and Array exercises
- Object-Oriented Programming examples
- Data Structures and Algorithms practice
- Company coding challenges
- Interview preparation solutions
- Design pattern examples

The goal is to improve problem-solving skills and maintain a reference library of Java solutions.

## Project Structure

```text
src
└── com.java.practise
    ├── arrays
    ├── strings
    └── companies
        ├── dsit
        ├── epam
        └── jpmc
```

### Packages

#### Arrays

Contains array-based coding challenges and solutions.

Examples:
- Array reversal
- Sorting
- Searching
- Frequency counting

#### Strings

Contains string manipulation problems.

Examples:
- Palindrome Checker
- Reverse Alphabetic Order
- Anagram Detection
- Character Frequency

#### Companies

Contains coding challenges inspired by real interview questions and assessments.

##### DSIT

Examples:

- Cinema Tickets Checkout Challenge
- Pricing Rules Engine
- Strategy Pattern Implementation
- Cart Total Calculation with Offers

Concepts Used:

- SOLID Principles
- Strategy Pattern
- Java Records
- Collections Framework
- Object-Oriented Design

##### EPAM

Contains coding exercises and interview preparation questions targeted toward EPAM-style assessments.

##### JPMC

Contains coding exercises and interview preparation questions targeted toward JPMorgan Chase technical interviews.

---

## Technologies

- Java 25
- IntelliJ IDEA
- Git
- GitHub

---

## Design Principles

This repository follows:

- Clean Code
- SOLID Principles
- Object-Oriented Programming
- Design Patterns
- Readable and Maintainable Code

---

## Example Interview Question

### Supermarket Checkout Challenge

Products:

| Code | Product | Price |
|--------|--------|--------|
| FR1 | Fruit Tea | £3.11 |
| SR1 | Strawberries | £5.00 |
| CF1 | Coffee | £11.23 |

Special Offers:

- Buy One Get One Free on Fruit Tea
- Strawberries cost £4.50 each when purchasing 3 or more

Expected checkout API:

```java
Checkout checkout = new Checkout(pricingRules);

checkout.scan("FR1");
checkout.scan("SR1");
checkout.scan("FR1");

System.out.println(checkout.total());
```

This solution is implemented under:

```text
companies/dsit
```

using the Strategy Pattern and configurable pricing rules.

---

## Future Additions

- Collections Practice
- Java Streams Problems
- Multithreading Examples
- Spring Boot Practice
- System Design Exercises
- LeetCode Solutions
- Company Interview Questions

---

## Author

Prudhvi Raj Maddineni

Repository created for continuous Java learning, interview preparation, and company-specific coding practice.