package com.ednSoftwareEngineering.demo.model.entities;

import com.ednSoftwareEngineering.demo.enums.PixKeyType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Table(name = "PixKeys")
@Entity
public class PixKey implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "pix_key_id")
    private String keyValue;
    @NotNull
    private PixKeyType keyType;
    @ManyToOne
    @JoinColumn(name = "users_id")
    //@JsonIgnore
    private User user;
    @ManyToOne
    @JoinColumn(name = "bank_account_id")
    //@JsonIgnore
    private BankAccount bankAccount;

    public PixKey(String keyValue, PixKeyType keyType, User user, BankAccount bankAccount) {
        this.keyValue = keyValue;
        this.keyType = keyType;
        this.user = user;
        this.bankAccount = bankAccount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PixKey pixKey = (PixKey) o;
        return Objects.equals(keyValue, pixKey.keyValue) && keyType == pixKey.keyType && Objects.equals(user, pixKey.user) && Objects.equals(bankAccount, pixKey.bankAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyValue, keyType, user, bankAccount);
    }

    public PixKey(){

    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }

    public PixKeyType getKeyType() {
        return keyType;
    }

    public void setKeyType(PixKeyType keyType) {
        keyType = keyType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
