# CLI Bank

A simple Java command-line banking demo built while following the YouTube tutorial: [CLI Bank (Java Tutorial)](https://www.youtube.com/watch?v=49bIIa6id08).

## About

This project is a beginner-friendly Java CLI app that simulates a basic banking flow:

- View current balance
- Deposit money
- Withdraw money
- Exit the app

It’s designed as a learning project to practice:

- Variables and primitive types
- Loops and conditionals
- `switch` expressions
- Methods and parameter passing
- Console input/output with `Scanner`
- Basic control flow in Java

## Features

- Starts with an initial balance of `0`
- Menu-driven interaction in a loop
- Balance checks to prevent overdrafts
- Input validation for deposit/withdraw amounts
- Simple, readable structure suitable for learners

## Project structure

```txt
CLIBank/
  ├─ src/
  │   └─ Main.java
  └─ README.md
```

## Prerequisites

- Java Development Kit (JDK) 11+ (works with newer versions too)
- Terminal/command line access

## How to run

From the project root:

### 1. Compile

```bash
javac -d out src/Main.java
```

### 2. Run

```bash
java -cp out Main
```

## Usage

You’ll see a menu like:

```txt
Enter 1 to see your balance
Enter 2 to deposit
Enter 3 to withdraw amount
Enter 4 to exit
```

Choose an option using numbers 1–4 and follow the prompts.

## Example session

```text
_______________________________________
          Welcome to CLI Bank
_______________________________________
What can we help you with?
Enter 1 to see your balance
Enter 2 to deposit
Enter 3 to withdraw amount
Enter 4 to exit
_______________________________________
Enter your choice(1-4): 2
Enter the amount you want to deposit: €100
_______________________________________
Enter your choice(1-4): 1
Your current balance is : €100.00
_______________________________________
Enter your choice(1-4): 4
Thank you for banking with us
_______________________________________
```

## Notes for future improvements

If you continue improving this app, you might add:

- Input validation for non-numeric input (currently, invalid text input can throw an error)
- Withdrawal checks for zero balance messages and currency formatting options
- Transaction history
- Persistent storage (file/database)
- Unit tests for deposit/withdraw behavior

## License

This project is educational and currently has no license specified.

