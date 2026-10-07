/*
@authoer Jasyen Noell
@date 10/5/2026
*/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
    // Creates the bank account used for each test
    private BankAccount account;

    // Creates a new account before each test
    @BeforeEach
    public void setUp() {
        account = new BankAccount();
    }

    // Tests depositing a positive amount
    @Test
    public void testDepositPositiveAmount() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    // Tests depositing zero
    @Test
    public void testDepositZeroAmount() {
        account.deposit(0);
        assertEquals(0, account.getBalance());
    }

    // Tests a normal withdrawal
    @Test
    public void testWithdrawValidAmount() {
        account.deposit(200);
        account.withdraw(150);
        assertEquals(50, account.getBalance());
    }

    // Tests that the account does not allow an overdraft
    @Test
    public void testWithdrawOverdraft() {
        account.deposit(100);
        account.withdraw(150);
        assertEquals(100, account.getBalance());
    }

    // Tests that a negative withdrawal does not change the balance
    @Test
    public void testWithdrawNegativeAmount() {
        account.deposit(100);
        account.withdraw(-50);
        assertEquals(100, account.getBalance());
    }

    // Tests multiple deposits and withdrawals
    @Test
    public void testMultipleDepositsAndWithdrawals() {
        account.deposit(100);
        account.deposit(50);
        account.withdraw(75);
        assertEquals(75, account.getBalance());
    }

    // Tests depositing a very large amount
    @Test
    public void testDepositVeryLargeAmount() {
        account.deposit(1000000);
        assertEquals(1000000, account.getBalance());
    }

    // Tests withdrawing the entire balance
    @Test
    public void testWithdrawExactBalance() {
        account.deposit(500);
        account.withdraw(500);
        assertEquals(0, account.getBalance());
    }
}