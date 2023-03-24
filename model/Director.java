package model;

public class Director {
    public static BankAccount.AccountBuilder accountBuilder(){
        return new BankAccount.AccountBuilder();
    }
}
