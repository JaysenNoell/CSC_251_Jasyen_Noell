/*
@authoer Jasyen Noell
@date 10/5/2026
*/

public class BankAccount {
    // Keeps track of the money in the account
    private double balance = 0;

    // Adds money to the account if the amount is positive
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Gets the current balance of the account
    public double getBalance() {
        return balance;
    }

    // Removes money if the amount is positive and there is enough money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
/*
    Reflection Questions:

    1. How did writing tests first help you clarify requirements?
    Writing tests first helped me understand what the BankAccount class
    needed to do before I wrote the actual code.

    2. Which errors were caught by tests that manual checks might miss?
    The tests could catch problems such as allowing negative withdrawals,
    allowing overdrafts, or incorrectly calculating the account balance.

    3. How does TDD improve software reliability?
    TDD improves software reliability by testing the code as it is developed.
    This helps find errors early and makes sure the code continues to work
    after changes are made.

    4. When might you not use TDD?
    TDD might not be used for very small programs, quick prototypes, or
    situations where writing tests would take much longer than the code itself.
    */