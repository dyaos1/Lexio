package dev.be.modulecommon.entity;

import dev.be.modulecommon.enums.Rank;
import dev.be.modulecommon.enums.Suit;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Rank rank;

    private Suit suit;

    @ManyToOne
    @JoinColumn(name = "participant_id")
    private Participant participant;

    public Card() {}

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Card(Rank rank, Suit suit, Participant participant) {
        this.rank = rank;
        this.suit = suit;
        this.participant = participant;
        this.participant.addCard(this);
    }
}
