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
    //todo adcionar a instituição
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "bank_account_id")
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "users_id")
    @JsonBackReference
    private User user;
    @OneToMany(mappedBy = "bankAccount",fetch = FetchType.LAZY)
    //TODO -------------
    //@JsonManagedReference
    private List<PixKey> pixKeys;
    private Double amount;
    @NotNull
    private AccountType accountType;

    public BankAccount(User user, List<PixKey> pixKeys, AccountType accountType, Double amount) {
        this.user = user;
        this.pixKeys = pixKeys;
        this.accountType=accountType;
        this.amount=amount;
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

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
