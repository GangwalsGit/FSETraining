package com.question1;

public class TestMain {

    // Method to deposit money
        public static int amountDeposited(int balance,
                                        int depositAmount)
        {
            System.out.println("Deposit Operation:");
            System.out.println("Amount to deposit : "
                            + depositAmount);
            balance = balance + depositAmount;
            System.out.println(
                "Your Money has been successfully deposited");
            displayBalance(balance);
            return balance;
        }

 

    // Method to withdraw money
    public static int amountWithdrawn(int balance,
                                        int withdrawAmount)
    {
        System.out.println("Withdrawn Operation:");
        System.out.println("Withdrawing Amount : "
                        + withdrawAmount);
        if (balance >= withdrawAmount) {
            balance = balance - withdrawAmount;
            System.out.println(
                "Please collect your money and collect the card");
            displayBalance(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
    }

    public static void displayBalance(int balance)
    {
        System.out.println("Account Balance : " + balance);
        System.out.println();
    }

    public static void main(String[] args) {

        int balance = 25000;
        int withdrawAmount = 7000;
        int depositAmount = 3000;

        // Method to display balance
        displayBalance(balance);

        // withdrawing amount
        balance= amountWithdrawn(balance, withdrawAmount);

        // depositing amount
        balance = amountDeposited(balance, depositAmount);

    }

}
