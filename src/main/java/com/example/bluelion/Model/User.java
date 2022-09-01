package com.example.bluelion.Model;

import lombok.*;

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
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @JoinColumn(name = "id")
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
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
