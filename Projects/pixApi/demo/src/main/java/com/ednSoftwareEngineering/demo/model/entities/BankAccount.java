package com.ednSoftwareEngineering.demo.model.entities;

import com.ednSoftwareEngineering.demo.enums.AccountType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
@Table(name = "BankAccounts")
@Entity
public class BankAccount implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "bank_account_id")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "users_id")
    private User user;
    @OneToMany(mappedBy = "bankAccount")
    private List<PixKey> pixKeys;
    @OneToMany(mappedBy = "sourceAccount", orphanRemoval = true)
    private List<Transactions> outgoingTransactions;

    @OneToMany(mappedBy = "destinationAccount", orphanRemoval = true)
    private List<Transactions> incomingTransactions;
    private Double accountBalance;
    @Enumerated(EnumType.STRING)
    private AccountType accountType;
    private String institutionName;

    public BankAccount(User user, List<PixKey> pixKeys, AccountType accountType, Double accountBalance, String institutionName, List<Transactions> incomingTransactions,List<Transactions> outgoingTransactions) {
        this.user = user;
        this.pixKeys = pixKeys;
        this.accountType=accountType;
        this.accountBalance=accountBalance;
        this.institutionName =institutionName;
        this.incomingTransactions=incomingTransactions;
        this.outgoingTransactions=outgoingTransactions;
    }
    public BankAccount(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public UUID getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<PixKey> getPixKeys() {
        return pixKeys;
    }

    public void setPixKeys(List<PixKey> pixKeys) {
        this.pixKeys = pixKeys;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public List<Transactions> getOutgoingTransactions() {
        return outgoingTransactions;
    }

    public void setOutgoingTransactions(List<Transactions> outgoingTransactions) {
        this.outgoingTransactions = outgoingTransactions;
    }

    public List<Transactions> getIncomingTransactions() {
        return incomingTransactions;
    }

    public void setIncomingTransactions(List<Transactions> incomingTransactions) {
        this.incomingTransactions = incomingTransactions;
    }
}
