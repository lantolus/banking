package com.example.springboottutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String firstName;
    private String lastName;
    private long balance;
    private long deposit;
    private long withdrawal;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getDeposit() {
        return deposit;
    }

    public long getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(long withdrawal) {
        this.withdrawal = withdrawal;
    }

    public Integer getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setDeposit(long deposit) { this.balance = balance + deposit; }



    public long getBalance() {
        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


}
