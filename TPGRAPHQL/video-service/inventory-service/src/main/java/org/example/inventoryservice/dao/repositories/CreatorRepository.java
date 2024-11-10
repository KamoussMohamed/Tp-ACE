package org.example.inventoryservice.dao.repositories;

import org.example.inventoryservice.dao.entites.Creator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreatorRepository extends JpaRepository<Creator, Long> {
}
