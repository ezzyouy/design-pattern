package model.repository;

import model.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepo {

    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(Long id);
    List<BankAccount> searchAccount(Predicate<BankAccount> bankAccountPredicate);
    BankAccount update(BankAccount bankAccount);
    void deleteById(Long id);
 }
