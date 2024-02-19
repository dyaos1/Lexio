package dev.be.modulecommon.repository;

import dev.be.modulecommon.entity.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
