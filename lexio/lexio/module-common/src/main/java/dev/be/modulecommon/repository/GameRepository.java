package dev.be.modulecommon.repository;

import dev.be.modulecommon.entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
