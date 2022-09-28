package com.example.universe.repositories;

import com.example.universe.models.Moon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoonRepository extends JpaRepository<Moon, Integer> {
}
