package com.example.bluelion.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Table(
        name = "Transactions",
        uniqueConstraints = {@UniqueConstraint(
                name = "id",
                columnNames = {"id"}
        )}
)
@Entity(
        name = "Transaction"
)
@Getter
@Setter
public class Transactions {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private Long id;
    private Double bankNumber;
    private LocalDate date;
    private Double cashIn;
    private Double cashOut;
    private Double balance;
    private Double loan;
    private Double withdrawal;
    private Double cashSent;
    private Double requestCash;

}
