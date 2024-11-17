package com.ednSoftwareEngineering.demo.model.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serial;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
@Table(name = "users")
@Entity
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "users_id")
    private UUID id;
    @NotEmpty
    private String name;
    @NotNull
    private LocalDate dateOfBirth;
    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE,fetch = FetchType.LAZY)
    //@JsonManagedReference
    private List<BankAccount> bankAccounts;
    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    //@JsonManagedReference
    private List<PixKey> pixKeys;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<PixKey> getPixKeys() {
        return pixKeys;
    }

    public void setPixKeys(List<PixKey> pixKeys) {
        this.pixKeys = pixKeys;
    }

    public User(String name, LocalDate dateOfBirth, List<BankAccount> bankAccounts, List<PixKey> pixKeys) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.bankAccounts = bankAccounts;
        this.pixKeys = pixKeys;
    }
    public User(){

    }
}
