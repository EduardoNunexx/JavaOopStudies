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
import java.util.UUID;

@Table(name = "PixKeys")
@Entity
public class PixKey implements Serializable {
    //todo implements equals and hash code
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "pix_key_id")
    private UUID id;
    @Column(unique = true)
    private String keyValue;
    @NotNull
    @Enumerated(EnumType.STRING)
    private PixKeyType keyType;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "bank_account_id")
    private BankAccount bankAccount;



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

    public void setKeyType(PixKeyType keyType) {this.keyType = keyType;
    }
    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public PixKey(String keyValue, PixKeyType keyType, BankAccount bankAccount) {
        this.keyValue = keyValue;
        this.keyType = keyType;
        this.bankAccount = bankAccount;
    }

    public UUID getId() {
        return id;
    }
}
