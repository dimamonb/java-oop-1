package objectsandclasses.project;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;

    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        double monthInterestRate = (annualInterestRate / 12) / 100;
        return balance * monthInterestRate;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public double deposit(double amount) {
        return balance += amount;
    }

    public static void main(String[] args) {
        Account account = new Account(1122, 20_000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);
        double mI = account.getMonthlyInterest();

        System.out.println("Баланс равен " + account.getBalance() + " руб.");
        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + " руб.");
        System.out.println("Этот счет был создан " + account.getDateCreated());
    }
}
