
# Java Looping Statements

In Java, looping statements are used to execute a block of code repeatedly based on a specified condition. There are mainly three types of looping statements in Java: `for`, `while`, and `do-while`.


## 1. `for` Loop

The `for` loop is used when the number of iterations is known beforehand.

### Syntax:
```java
for (initialization; condition; update) {
    // Code to be executed
}
```

### Example:
```java
for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
}
```

## 2. `while` Loop

The `while` loop is used when the number of iterations is not known beforehand, and the loop continues as long as a specified condition is true.

### Syntax:
```java
while (condition) {
    // Code to be executed
}
```

### Example:
```java
int i = 1;
while (i <= 10) {
    System.out.println(number + "*" + i + "=" + number * i);
    i += 1;
}
```

## 3. `do-while` Loop

The `do-while` loop is similar to the `while` loop, but the condition is checked after executing the code block, so it always executes at least once.

### Syntax:
```java
do {
    // Code to be executed
} while (condition);
```

### Example:
```java
int i = 1;
do {
    System.out.println("This is Do block: ");
    i++;
} while (i <= 10);
```

These looping statements provide flexibility in controlling the flow of execution in Java programs and are essential for repetitive tasks.
```
