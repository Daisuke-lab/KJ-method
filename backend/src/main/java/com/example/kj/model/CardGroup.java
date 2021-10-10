package com.example.kj.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;

import static javax.persistence.GenerationType.AUTO;


@Entity
@Table
@Getter
@Setter
public class CardGroup {

    @Id
    @GeneratedValue(strategy=AUTO)
    private Long id;
    @OneToMany(mappedBy="card_group", fetch= FetchType.EAGER)
    private Set<Card> cards;
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name = "room_id")
    private Room room;
    private String name;
    private String description;
}
