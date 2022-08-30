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
    private Long id;
    private String name;
    private String password;
    private String surname;
    private Integer bankNumber;
}
