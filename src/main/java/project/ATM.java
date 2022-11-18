package project;

import java.util.Scanner;

public class ATM {

    private final String BALANCE_IS_EQUAL = "Баланс равен %f%n";
    private final Account[] accounts;
    private Scanner scanner;

    public ATM() {
        scanner = new Scanner(System.in);
        this.accounts= new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 10_000);
        }
    }

    public void withdraw(int id) {
        System.out.print("Введите сумму для снятия: ");
        double amount = scanner.nextDouble();
        if (amount < 0) {
            System.out.println("Введена отрицательная сумма!");
        } else if ((accounts[id].getBalance() - amount) < 0) {
            System.out.println("Недостаточно средств на счете!");
        } else {
            accounts[id].withdraw(amount);
        }
    }

    public void deposit(int id) {
        System.out.print("Введите сумму для внесения: ");
        double amount = scanner.nextDouble();
        if(amount < 0) {
            System.out.println("Введена отрицательная сумма!");
        } else {
            accounts[id].deposit(amount);
        }

    }

    public Account[] getAccounts() {
        return accounts;
    }

    public Scanner getScanner() {
        return scanner;
    }


    public void mainMenu(Account acc){
        int choice = 0;
        while (choice != 4) {
            System.out.println("Основное меню: \n");
            System.out.println("1: проверить баланс счета\n");
            System.out.println("2: снять со счета\n");
            System.out.println("3: положить на счет\n");
            System.out.println("4: выйти\n");
            System.out.print("Введите пункт меню: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf(BALANCE_IS_EQUAL, acc.getBalance());
                    break;
                case 2:
                    withdraw(acc.getId());
                    System.out.printf(BALANCE_IS_EQUAL, acc.getBalance());
                    break;
                case 3:
                    deposit(acc.getId());
                    System.out.printf(BALANCE_IS_EQUAL, acc.getBalance());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Введен неправильный корректный пункт меню...\n");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner in = atm.getScanner();
        while (true) {
            System.out.print("Введите ID: ");
            int id = in.nextInt();
            if (id <= 1 || id >= 10 ) {
                System.out.println("Введите корректный ID!");
                continue;
            }
            atm.mainMenu(atm.getAccounts()[id]);
        }


    }
}
