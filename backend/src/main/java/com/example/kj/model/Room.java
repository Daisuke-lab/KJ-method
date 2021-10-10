package com.example.kj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Table
@Setter
@Getter
public class Room {
    @Id
    @GeneratedValue(strategy=AUTO)
    private Long id;
    @OneToMany(mappedBy="room", fetch= FetchType.EAGER)
    private Set<Card> cards;
    @OneToMany(mappedBy="room", fetch= FetchType.EAGER)
    private Set<CardGroup> card_groups;
    @ManyToMany
    @JoinTable(name ="user_rooms",
    joinColumns=@JoinColumn(name="user_id"),
    inverseJoinColumns=@JoinColumn(name="room_id"))
    private Set<User> users;
    private String name;
    private String description;
}
