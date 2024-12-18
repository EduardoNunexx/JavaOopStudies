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

    private String name;
    private LocalDate dateOfBirth;
    @OneToMany(mappedBy = "user",cascade = CascadeType.REMOVE)
    private List<BankAccount> bankAccounts;

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


    public User(String name, LocalDate dateOfBirth, List<BankAccount> bankAccounts) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.bankAccounts = bankAccounts;
    }
    public User(){

    }

}
