package project;

import java.util.Scanner;

public class ATM {

    public ATM() {
    }

    public void mainMenu(Scanner in){
        int choice = 0;
        while (true) {
            System.out.println("Основное меню: \n");
            System.out.println("1: проверить баланс счета\n");
            System.out.println("2: снять со счета\n");
            System.out.println("3: положить на счет\n");
            System.out.println("4: выйти\n");
            System.out.print("Введите пункт меню: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1");

                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                default:
                    System.out.println("Введен неправильный корректный пункт меню...\n");
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
        atm.mainMenu(in);
    }
}
