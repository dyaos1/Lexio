package dev.be.modulecommon.entity;

import dev.be.modulecommon.enums.ParticipantType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.PartitionKey;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ParticipantType participantType;

    private String name = "";

    @ManyToOne
    private Game game;

    @OneToMany(mappedBy = "participant")
    private List<Card> cards = new ArrayList<>();

    public Participant() {}

    public Participant(ParticipantType participantType, Game game) {
        this.participantType = participantType;
        this.game = game;
    }

    public Participant(ParticipantType participantType, Game game, String name) {
        this.participantType = participantType;
        this.game = game;
        this.name = name;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void drawCard(Participant participant) {
        List<Card> deck = participant.cards;
        this.cards.add(deck.remove(deck.size()-1));
    }

    public void drawCard(Participant participant, int number) {
        List<Card> deck = participant.cards;
        int count = deck.size()-1;
        for(int i = 0; i < number ; i++) {
            this.cards.add(deck.remove(count-i));
        }
    }
}
