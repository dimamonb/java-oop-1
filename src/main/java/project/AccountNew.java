package project;

import java.util.ArrayList;
import java.util.Date;

public class AccountNew {
    private int id;
    private String name;
    private double balance;
    private static double annualInterestRate;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    private Date dateCreated;

    public AccountNew() {
        dateCreated = new Date();
    }

    public AccountNew(int id, double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public AccountNew(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        dateCreated = new Date();
    }





    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        AccountNew.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest() {
        double monthInterestRate = (annualInterestRate / 12) / 100;
        return balance * monthInterestRate;
    }

    public double withdraw(double amount) {
        balance -= amount;
        Transaction tr = new Transaction('-', amount, balance, "withdraw");
        transactions.add(tr);
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        Transaction tr = new Transaction('+', amount, balance, "deposit");
        transactions.add(tr);
        return balance;
    }

    public static void main(String[] args) {
        AccountNew account = new AccountNew(1122, 20_000);
        AccountNew.setAnnualInterestRate(4.5);
        account.withdraw(2_500);
        account.deposit(3_000);
        double mI = account.getMonthlyInterest();

        System.out.println("Баланс равен " + account.getBalance() + " руб.");
        System.out.println("Ежемесячный процент равен " + account.getMonthlyInterest() + " руб.");
        System.out.println("Этот счет был создан " + account.getDateCreated());
    }
}
