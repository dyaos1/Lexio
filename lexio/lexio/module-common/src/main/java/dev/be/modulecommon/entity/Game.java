package dev.be.modulecommon.entity;

import dev.be.modulecommon.enums.ParticipantType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "game")
    private List<Participant> participantList = new ArrayList<>();

    private int round = 0;

    public Game() {}

    public Game(Participant gameTable, Participant dealer) {
        this.participantList.add(gameTable);
        this.participantList.add(dealer);
    }

    public Game(Participant gameTable, Participant dealer, List<Participant> playerList) {
        this.participantList.add(gameTable);
        this.participantList.add(dealer);
        this.participantList.addAll(playerList);
    }

    public void addPlayer(Participant player) {
        this.participantList.add(player);
    }

    public void addPlayerList(List<Participant> playerList) {
        this.participantList.addAll(playerList);
    }

    public Participant getTable() {
        return this.participantList
                .stream()
                .filter(it -> it.getParticipantType() == ParticipantType.TABLE)
                .toList()
                .get(0);
    }

    public Participant getDealer() {
        return this.participantList
                .stream()
                .filter(it -> it.getParticipantType() == ParticipantType.DEALER)
                .toList()
                .get(0);
    }

    public List<Participant> getPlayerList() {
        return this.participantList
                .stream()
                .filter(it -> it.getParticipantType() == ParticipantType.PLAYER)
                .toList();
    }
}