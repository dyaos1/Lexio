package dev.be.modulecommon.repository;

import dev.be.modulecommon.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
