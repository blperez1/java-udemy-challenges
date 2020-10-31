package exercises;

import java.sql.SQLOutput;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(9372834, 2.50, "default name", "default email", "213094743");
    }
    public BankAccount(int accountNumber, double balance, String customerName,String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositMoney(double deposit) {
        this.balance += deposit;
    }

    public void withdrawMoney(double withdrawAmount) {
        if(balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds");
        }else{
            balance -= withdrawAmount;
            System.out.println("WithDraw processed. Balance remaining = " + (balance - withdrawAmount));
        }
    }
}
