package com.example.kj.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.AUTO;

@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email")
})
@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy=AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    @OneToMany(mappedBy="user", fetch= FetchType.EAGER)
    private Set<Card> cards;
    @ManyToMany(fetch= FetchType.EAGER)
    private Set<Room> rooms;
    @Column(nullable = false)
    private Boolean emailVerified = false;

    @NotNull
    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    private String providerId;

}
