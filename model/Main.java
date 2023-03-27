package model;

import model.Util.JsonSerializer;
import model.repository.AccountRepoImpl;

import java.io.IOException;
import java.util.List;
import  java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepoImpl accountRepo=AccountRepoImpl.getInstance();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                accountRepo.populateData();
            }).start();
        }
        System.out.println("Taper une touche");
        System.in.read();
        //accountRepo.populateData();
        List<BankAccount> bankAccounts=accountRepo
                .searchAccount(bankAccount -> bankAccount.getStatus().equals(AccountStatus.ACTIVATED) && bankAccount.getBalance()>1000);
        bankAccounts.stream()
                .map(bankAccountJsonSerializer::toJson)
                .forEach(System.out::println);

       /* System.out.println("::::::::::::::::::::::::::::::");

        BankAccount account = accountRepo.findById(1L).orElse(null);
        if(account!=null){
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }*/
    }
}
