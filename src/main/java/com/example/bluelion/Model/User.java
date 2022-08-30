package com.example.bluelion.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(
        name = "Users",
        uniqueConstraints = {@UniqueConstraint(
                name = "id",
                columnNames = {"id"}
        )}
)
@Entity(
        name = "User"
)
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )

    @Column(name = "Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Password")
    private String password;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "BankNumber")
    private Integer bankNumber;
}
