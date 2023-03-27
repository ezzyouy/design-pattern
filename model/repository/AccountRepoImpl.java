package model.repository;

import model.AccountStatus;
import model.AccountType;
import model.BankAccount;
import model.Director;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepoImpl implements AccountRepo {

    private static  AccountRepoImpl acc;
    static {
        System.out.println("Singleton instantiation");
        acc=new AccountRepoImpl();
    }

    private Map<Long, BankAccount> bankAccountMap=new HashMap<>();
    private long accountCount=0;

    @Override
    public BankAccount save(BankAccount bankAccount) {


            Long accountId;
            synchronized (this) {
                accountId = ++accountCount;
            }
            bankAccount.setAccountId(accountId);
            synchronized (this){
                bankAccountMap.put(accountId, bankAccount);
            }

            return bankAccount;

    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().collect(Collectors.toList());
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount bankAccount=bankAccountMap.get(id);
        if(bankAccount==null)
            return Optional.empty();
        else
            return Optional.of(bankAccount);
    }

    @Override
    public List<BankAccount> searchAccount(Predicate<BankAccount> bankAccountPredicate) {
        return bankAccountMap.values().stream().filter(bankAccountPredicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.getAccountId(), bankAccount);
        return bankAccount;
    }

    @Override
    public void deleteById(Long id) {
        bankAccountMap.remove(id);
    }

    public  void populateData(){
        for (int i = 0; i < 10; i++) {
            BankAccount bankAccount= Director.accountBuilder()
                    .balance(1000*Math.random()*90000)
                    .currency(Math.random() > 0.5 ?  "MAd" : "EUR")
                    .type(Math.random() > 0.5 ? AccountType.SAVING_ACCOUNT : AccountType.CURRENT_ACCOUNT)
                    .status(Math.random() > 0.5 ? AccountStatus.CREATED: AccountStatus.ACTIVATED)
                    .build();
            save(bankAccount);
        }
        System.out.println("***********************");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Account Count = "+acc.accountCount);
        System.out.println("Size: "+bankAccountMap.size() );
        System.out.println("***********************");
    }


    public static AccountRepoImpl getInstance(){
        /*if(acc == null){
            System.out.println("Singleton instantiation");
            acc=new AccountRepoImpl();
        }*/
        return acc;
    }
}
