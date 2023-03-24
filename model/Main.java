package model;

import model.Util.JsonSerializer;
import model.repository.AccountRepoImpl;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        JsonSerializer<BankAccount> bankAccountJsonSerializer=new JsonSerializer<>();
        AccountRepoImpl accountRepo=AccountRepoImpl.getInstance();
        accountRepo.populateData();
        List<BankAccount> bankAccounts=accountRepo.searchAccount(bankAccount -> bankAccount.getStatus().equals(AccountStatus.ACTIVATED) && bankAccount.getBalance()>1000);
        bankAccounts.stream().map(bankAccountJsonSerializer::toJson).forEach(System.out::println);

       /* System.out.println("::::::::::::::::::::::::::::::");

        BankAccount account = accountRepo.findById(1L).orElse(null);
        if(account!=null){
            System.out.println(bankAccountJsonSerializer.toJson(account));
        }*/
    }
}
