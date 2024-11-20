package com.ednSoftwareEngineering.demo.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "source_account_id")
    private BankAccount sourceAccount;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "destination_account_id")
    private BankAccount destinationAccount;


    @NotNull
    private Double amount;

    @NotNull//todo verificar esse tempo
    private LocalDateTime timestamp = LocalDateTime.now();

    // Outros campos relevantes
    private String description; // Ex.: "Pagamento de aluguel"

    public Transactions() {

    }

    public Transactions(BankAccount destinationAccount, Double amount, LocalDateTime now) {
        this.destinationAccount=destinationAccount;
        this.amount=amount;
        this.timestamp=now;
    }

    public BankAccount getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(BankAccount sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public BankAccount getDestinationAccount() {
        return destinationAccount;
    }

    public void setDestinationAccount(BankAccount destinationAccount) {
        this.destinationAccount = destinationAccount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Transactions(BankAccount sourceAccount, BankAccount destinationAccount, Double amount, LocalDateTime timestamp, String description) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
        this.timestamp = timestamp;
        this.description = description;
    }

    public UUID getId() {
        return id;
    }
}
