package com.ednSoftwareEngineering.demo.model.repository;

import com.ednSoftwareEngineering.demo.model.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransactionsRepository extends JpaRepository<Transactions, UUID> {
}
