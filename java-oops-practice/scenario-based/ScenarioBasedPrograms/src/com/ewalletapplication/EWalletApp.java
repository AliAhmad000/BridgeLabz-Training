package com.ewalletapplication;

public class EWalletApp {

    public static void main(String[] args) {

        User u1 = new User(1, "Ali", new PersonalWallet(100));
        User u2 = new User(2, "Gaurav", new BusinessWallet());

        u1.getWallet().loadMoney(1000);
        u2.getWallet().loadMoney(5000);

        u1.getWallet().transferTo(u2, 300);
        u2.getWallet().transferTo(u1, 1000);

        System.out.println("\nBalances:");
        System.out.println("Ali: Rs." + u1.getWallet().getBalance());
        System.out.println("Gaurav: Rs." + u2.getWallet().getBalance());

        System.out.println("\nAli Transactions:");
        u1.getWallet().showTransactions();
    }
}
