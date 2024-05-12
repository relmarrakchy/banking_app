package com.elmarrakchy.ebanking.repositories;

import com.elmarrakchy.ebanking.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}