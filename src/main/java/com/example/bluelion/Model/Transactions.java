package com.example.bluelion.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

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
@Data
@Getter
@Setter
public class Transactions {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    @Column(name = "id")
    private Long id;

    @Column(name = "BANKNUMBER")
    private Double bankNumber;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    @Column(name = "DATE"
    )
    private Date date;

    @Column(name = "CASHIN")
    private Double cashIn;

    @Column(name = "CASHOUT")
    private Double cashOut;

    @Column(name = "BALANCE")
    private Double balance;

    @Column(name = "LOAN")
    private Double loan;

    @Column(name = "WITHDRAWAL")
    private Double withdrawal;

    @Column(name = "CASHSENT")
    private Double cashSent;

    @Column(name = "REQUESTCASH")
    private Double requestCash;

}
