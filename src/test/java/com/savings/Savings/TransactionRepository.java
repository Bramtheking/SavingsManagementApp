package com.savings.Savings;

import javax.transaction.Transaction;

import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Transaction save(Transaction transaction);
    // Define custom query methods here if needed.
}
