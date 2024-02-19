package dev.be.blackjack.service;

import dev.be.modulecommon.repository.CardRepository;
import dev.be.modulecommon.repository.GameRepository;
import dev.be.modulecommon.repository.ParticipantRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter @Setter
public class GameService {
    private final CardRepository cardRepository;
    private final ParticipantRepository participantRepository;
    private final GameRepository gameRepository;
}
