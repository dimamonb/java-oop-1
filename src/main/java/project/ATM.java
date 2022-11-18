package project;

import java.util.Scanner;

public class ATM {

    public ATM() {
    }

    public void mainMenu(Scanner in, Account acc){
        int choice = 0;
        while (choice != 4) {
            System.out.println("Основное меню: \n");
            System.out.println("1: проверить баланс счета\n");
            System.out.println("2: снять со счета\n");
            System.out.println("3: положить на счет\n");
            System.out.println("4: выйти\n");
            System.out.print("Введите пункт меню: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(String.format("Баланс равен %а", acc.getBalance()));
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
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
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 10_000);
        }

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ID: ");
            int id = in.nextInt();
            if (id <= 1 || id >= 10 ) {
                System.out.println("Введите корректный ID!");
                continue;
            }
            atm.mainMenu(in, accounts[id]);
        }


    }
}
