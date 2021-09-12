package ru.zsa.nostromo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.zsa.nostromo.entity.Rover;

public interface RoverRepository extends JpaRepository<Rover, Long> {
}
