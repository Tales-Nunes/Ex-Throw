package application;

import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = scanner.nextInt();
            System.out.println("Holder: ");
            scanner.nextLine();
            String holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = scanner.nextDouble();
            Account account = new Account(number, holder, balance, limit);
            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            account.withdraw(scanner.nextDouble());
            System.out.println("New balance: " + account.getBalance());
            scanner.close();
        }
        catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
    }
}